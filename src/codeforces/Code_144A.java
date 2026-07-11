package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_144A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int minIdx = -1;
        int maxIdx = -1;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIdx = i;
            }
            if (arr[i] == max && maxIdx == -1) {
                maxIdx = i;
            }
        }

        int result;
        if (maxIdx > minIdx) {
            result = maxIdx + n - 1 - minIdx - 1;
        } else {
            result = maxIdx + n - 1 - minIdx;
        }

        bw.write(result + "");
        bw.flush();
    }
}
