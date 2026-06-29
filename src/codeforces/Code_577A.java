package codeforces;

import java.io.*;

public class Code_577A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0) {
                int j = x / i;
                if (j <= n) {
                    count++;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
