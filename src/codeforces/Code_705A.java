package codeforces;

import java.io.*;

public class Code_705A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i == n) {
                    sb.append("I hate it");
                } else {
                    sb.append("I hate that ");
                }
            } else {
                if (i == n) {
                    sb.append("I love it");
                } else {
                    sb.append("I love that ");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
