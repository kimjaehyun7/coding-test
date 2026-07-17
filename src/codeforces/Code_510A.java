package codeforces;

import java.io.*;

public class Code_510A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();

        boolean right = true;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    bw.write("#");
                }
                bw.write("\n");
            } else {
                if (right) {
                    for (int j = 0; j < m - 1; j++) {
                        bw.write(".");
                    }
                    bw.write("#\n");
                    right = false;
                } else {
                    bw.write("#");
                    for (int j = 0; j < m - 1; j++) {
                        bw.write(".");
                    }
                    bw.write("\n");
                    right = true;
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
