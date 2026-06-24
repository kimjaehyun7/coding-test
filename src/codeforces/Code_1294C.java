package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Code_1294C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            Set<Integer> set = new HashSet<>();

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    set.add(j);
                    n /= j;
                    if (n == 1) {
                        break;
                    }
                }
                if (set.size() == 2) {
                    set.add(n);
                    break;
                }
            }

            if (set.size() == 3) {
                bw.write("YES\n");
                for (Integer integer : set) {
                    bw.write(integer + " ");
                }
                bw.write("\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
    }
}
