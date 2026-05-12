package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_136A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        int idx = 1;
        for (int i : Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()) {
            arr[i] = idx++;
        }

        for (int i = 1; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
    }
}
