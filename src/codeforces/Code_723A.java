package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_723A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr);

        int x1 = arr[0];
        int x2 = arr[1];
        int x3 = arr[2];

        int result = (x2 - x1) + (x3 - x2);

        bw.write(result + "");
        bw.flush();
    }
}
