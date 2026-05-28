package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Code_1520D {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            Map<Integer, Long> map = new HashMap<>();

            long result = 0;

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 1; j <= n; j++) {
                int k = arr[j - 1];

                int key = k - j;

                result += map.getOrDefault(key, 0L);

                map.put(key, map.getOrDefault(key, 0L) + 1);
            }

            bw.write(result + "\n");


        }

        bw.flush();
    }
}
