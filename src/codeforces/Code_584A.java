package codeforces;

import java.io.*;

public class Code_584A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int t = Integer.parseInt(s[1]);

        if (n == 1) {
            if (t == 10) {
                bw.write("-1");
            } else {
                bw.write(t + "");
            }
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(t));
            if (t == 10) {
                for (int i = 2; i < n; i++) {
                    sb.append("0");
                }
            } else {
                for (int i = 1; i < n; i++) {
                    sb.append("0");
                }
            }
            bw.write(sb.toString());
        }

        bw.flush();
    }
}
