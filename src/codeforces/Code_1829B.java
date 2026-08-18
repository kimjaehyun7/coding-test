package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_1829B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int zeroCount = 0;
            int max = 0;

            for (int j : arr) {
                if (j == 0) {
                    zeroCount++;
                    max = Math.max(zeroCount, max);
                } else {
                    zeroCount = 0;
                }
            }
            bw.write(max + "\n");
        }
        bw.flush();
    }
}
