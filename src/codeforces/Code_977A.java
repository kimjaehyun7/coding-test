package codeforces;

import java.io.*;

public class Code_977A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }

        bw.write(n + "");
        bw.flush();
    }
}
