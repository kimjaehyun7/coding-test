package baekjoon;

import java.io.*;

public class Baekjoon_1463 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            // 1을 빼는 연산
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어질 때
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            // 3으로 나누어 떨어질 때
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        bw.write(dp[n] + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
