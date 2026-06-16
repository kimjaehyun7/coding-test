package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Code_1791D {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            char[] arr = br.readLine().toCharArray();
            Set<Character> set = new HashSet<>();

            int[] prefix = new int[n];
            for (int j = 0; j < n; j++) {
                set.add(arr[j]);
                prefix[j] = set.size();
            }
            set.clear();

            int[] suffix = new int[n];
            for (int j = n - 1; j >= 0; j--) {
                set.add(arr[j]);
                suffix[j] = set.size();
            }

            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n - 1; j++) {
                max = Math.max(max, prefix[j] + suffix[j + 1]);
            }
            bw.write(max + "\n");
        }
        bw.flush();
    }
}
