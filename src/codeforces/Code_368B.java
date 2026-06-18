package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Code_368B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] prefix = new int[n + 1];
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = n; i >= 1; i--) {
            if (set.add(arr[i - 1])) {
                prefix[i] = ++count;
            } else {
                prefix[i] = count;
            }
        }
        for (int i = 0; i < m; i++) {
            int l = Integer.parseInt(br.readLine());
            int result = prefix[l];
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
