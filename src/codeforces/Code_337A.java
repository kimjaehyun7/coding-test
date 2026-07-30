package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_337A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int tmp = arr[i + n - 1] - arr[i];

            min = Math.min(min, tmp);
        }

        if (min == Integer.MAX_VALUE) {
            min = 0;
        }

        bw.write(min + "");
        bw.flush();
    }
}
