package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_1901A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]); // 주유소 개수
            int x = Integer.parseInt(s[1]); // 목적지 위치 0 -> x -> 0

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int max = arr[0];

            int cur = arr[0];
            for (int j = 0; j < n; j++) {
                int tmp = arr[j] - cur;

                max = Math.max(max, tmp);

                cur = arr[j];

                if (j == n - 1) {
                    int k = (x - arr[j]) * 2;

                    max = Math.max(max, k);
                }
            }
            bw.write(max + "\n");
        }
        bw.flush();
    }
}
