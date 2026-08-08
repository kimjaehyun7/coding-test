package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_1154A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr);

        int a = arr[3] - arr[0];
        int b = arr[3] - arr[1];
        int c = arr[3] - arr[2];

        bw.write(a + " " + b + " " + c);
        bw.flush();
    }
}
