package baekjoon;

import java.io.*;

public class Baekjoon_10844 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n + 1][10]; // dp[i][j] -> i자리 계단 수 중 마지막 숫자가 j인 경우의 개수
        int mod = 1000000000;

        // 길이가 1이면 0을 제외하고 1개이다.
        dp[1][0] = 0; // 0은 계단 수가 아니다.
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1] % mod;
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][8] % mod;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[n][i];
        }
        sum %= mod;
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
