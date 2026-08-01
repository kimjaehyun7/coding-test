package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_155A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                count++;
                min = arr[i];
            } else if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
