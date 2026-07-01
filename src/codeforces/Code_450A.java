package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_450A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int c = 0;
            if (arr[i] % m == 0) {
                c = arr[i] / m;
            } else {
                c = (arr[i] / m) + 1;
            }

            if (count <= c) {
                result = i + 1;
                count = c;
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}
