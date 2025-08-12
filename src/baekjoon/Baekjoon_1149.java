package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_1149 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] cost = new int[n][3]; // [][0] -> 빨강 / [][1] -> 초록 / [][2] -> 파랑
        for (int i = 0; i < n; i++) {
            cost[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] dp = new int[n][3];
        // 첫 번째 집 등록
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]); // 0 -> 1,2 선택
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]); // 1 -> 0,2 선택
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]); // 2 -> 0,1 선택
        }

        int result = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
