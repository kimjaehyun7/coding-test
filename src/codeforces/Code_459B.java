package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_459B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int minCount = 0;
        int maxCount = 0;
        for (int i : arr) {
            if (i == min) {
                minCount++;
            }
            if (i == max) {
                maxCount++;
            }
        }

        long result;
        if (min == max) {
            result = (long) n * (n - 1) / 2;
        } else {
            result = (long) minCount * maxCount;
        }

        bw.write(max - min + " " + result);
        bw.flush();
    }
}
