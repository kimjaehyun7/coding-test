package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_455A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] count = new int[100001];
        long[] score = new long[100001];

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : arr) {
            count[i]++;
        }
        for (int i = 1; i <= 100000; i++) {
            score[i] = (long) i * count[i];
        }
        long[] dp = new long[100001];
        dp[1] = score[1];

        for (int i = 2; i <= 100000; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + score[i]);
        }

        long result = dp[100000];

        bw.write(result + "");
        bw.flush();
    }
}
