package baekjoon;

import java.io.*;

public class Baekjoon_1904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) bw.write("1");
        if (n == 2) bw.write("2");
        if (n >= 3) {
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }
            bw.write(dp[n - 1] + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
