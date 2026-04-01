package baekjoon;

import java.io.*;

public class Baekjoon_2042 {

    static long[] arr;
    static long[] tree;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 수의 개수
        int m = Integer.parseInt(s[1]); // 수의 변경이 일어나는 횟수
        int k = Integer.parseInt(s[2]); // 구간의 합을 구하는 횟수

        arr = new long[n + 1];
        tree = new long[n * 4];
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        build(1, 1, n);

        for (int i = 0; i < m + k; i++) {
            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            long c = Long.parseLong(sp[2]);

            if (a == 1) { // update
                long diff = c - arr[b];
                arr[b] = c;
                update(1, 1, n, b, diff);
            } else { // a == 2 -> sum
                bw.write(query(1, 1, n, b, (int) c) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        build(node * 2, start, mid);
        build(node * 2 + 1, mid + 1, end);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    static void update(int node, int start, int end, int idx, long diff) {
        if (start > idx || end < idx) {
            return;
        }

        tree[node] += diff;

        if (start == end) {
            return;
        }

        int mid = (start + end) / 2;

        update(node * 2, start, mid, idx, diff);
        update(node * 2 + 1, mid + 1, end, idx, diff);
    }

    static long query(int node, int start, int end, int left, int right) {
        if (start > right || end < left) {
            return 0;
        }

        if (start >= left && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        return query(node * 2, start, mid, left, right) +
                query(node * 2 + 1, mid + 1, end, left, right);
    }
}
