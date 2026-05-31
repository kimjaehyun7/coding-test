package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_2232A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Arrays.sort(arr);

            int mid = arr[n / 2];

            int left = 0;
            int right = 0;

            for (int j : arr) {
                if (j < mid) {
                    left++;
                } else if (j > mid) {
                    right++;
                }
            }

            int result = Math.max(left, right);
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
