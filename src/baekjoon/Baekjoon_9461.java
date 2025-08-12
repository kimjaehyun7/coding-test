package baekjoon;

import java.io.*;

public class Baekjoon_9461 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = 0;
        long[] dp = new long[100];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        for (int i = 5; i < 100; i++) {
            dp[i] = dp[i - 1] + dp[index];
            index++;
        }
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n - 1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
