package baekjoon;

import java.io.*;

public class Baekjoon_15652 {

    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        arr = new int[M];

        dfs(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        if (depth == M) {
            StringBuilder temp = new StringBuilder();
            temp.append(arr[0] + " ");
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    return;
                }
                temp.append(arr[i] + " ");
            }
            sb.append(temp).append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
