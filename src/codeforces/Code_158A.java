package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_158A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int result = 0;
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int kScore = arr[k - 1];
        for (int i : arr) {
            if (i==0) continue;
            if (i >= kScore) {
                result++;
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}
