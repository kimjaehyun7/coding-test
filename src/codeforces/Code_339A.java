package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_339A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split("\\+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                bw.write(arr[i] + "");
            } else {
                bw.write(arr[i] + "+");
            }
        }
        bw.flush();
    }
}
