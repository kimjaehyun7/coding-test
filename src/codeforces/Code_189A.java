package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_189A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);
        int c = Integer.parseInt(s[3]);

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -100000);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= a) {
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }
            if (i >= b) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }
            if (i >= c) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }

        bw.write(dp[n] + "");
        bw.flush();
    }
}
