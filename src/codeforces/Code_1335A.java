package codeforces;

import java.io.*;

public class Code_1335A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n % 2 == 0) {
                bw.write(n / 2 - 1 + "\n");
            } else {
                bw.write(n / 2 + "\n");
            }
        }
        bw.flush();
    }
}
