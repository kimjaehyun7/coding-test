package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_580A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] dp = new int[n + 1];

        int cur = 0;

        for (int i = 1; i <= n; i++) {
            if (cur <= arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
            cur = arr[i - 1];
        }

        int max = Arrays.stream(dp).max().getAsInt();

        bw.write(max + "");
        bw.flush();
    }
}
