package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1912 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        String[] s = br.readLine().split(" ");
        dp[0] = Integer.parseInt(s[0]);

        for (int i = 1; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            dp[i] = Math.max(num, num + dp[i - 1]);
        }
        int max = Arrays.stream(dp).max().getAsInt();

        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
