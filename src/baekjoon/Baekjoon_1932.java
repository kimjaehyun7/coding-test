package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1932 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n][n];
        dp[0][0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                if (j == 0) { // 가장 왼쪽
                    dp[i][j] = dp[i - 1][j] + Integer.parseInt(s[j]);
                } else if (j == s.length - 1) { // 가장 오른쪽
                    dp[i][j] = dp[i - 1][j - 1] + Integer.parseInt(s[j]);
                } else { // 중간 숫자
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + Integer.parseInt(s[j]);
                }
            }
        }
        int max = Arrays.stream(dp[n - 1]).max().getAsInt();

        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
