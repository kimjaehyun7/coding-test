package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Code_1849B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]); // 몬스터 n 마리
            int k = Integer.parseInt(s[1]); // 현재 체력이 가장 높은 몬스터에게 k의 피해

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray(); // 몬스터 체력

            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> (a[1] == b[1])
                            ? Integer.compare(a[0], b[0])
                            : Integer.compare(b[1], a[1])
            );

            for (int j = 1; j <= n; j++) {
                pq.offer(new int[]{j, arr[j - 1]});
            }

            while (!pq.isEmpty()) {
                int[] cur = pq.poll();

                if (cur[1] - k <= 0) {
                    bw.write(cur[0] + " ");
                } else {
                    pq.offer(new int[]{cur[0], (cur[1] % k == 0) ? k : cur[1] % k});
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}