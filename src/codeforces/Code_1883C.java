package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_1883C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (k == 4) {
                int count = Integer.MAX_VALUE;

                for (int num : arr) {
                    count = Math.min(count, (4 - num % 4) % 4);
                }

                int evenCount = 0;
                for (int num : arr) {
                    if (num % 2 == 0) {
                        evenCount++;
                    }
                }
                int cost;
                if (evenCount >= 2) {
                    cost = 0;
                } else if (evenCount == 1) {
                    cost = 1;
                } else {
                    cost = 2;
                }
                count = Math.min(count, cost);
                bw.write(count + "\n");
            } else {
                int count = Integer.MAX_VALUE;

                for (int num : arr) {
                    count = Math.min(count, (k - num % k) % k);
                }
                bw.write(count + "\n");
            }
        }
        bw.flush();
    }
}
