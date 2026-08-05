package codeforces;

import java.io.*;

public class Code_1475A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            boolean ans = false;

            if (n % 2 != 0 && n > 1) {
                ans = true;
            } else {
                while (n > 1) {
                    n /= 2;
                    if (n % 2 != 0 && n > 1) {
                        ans = true;
                        break;
                    }
                }
            }
            if (ans) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
