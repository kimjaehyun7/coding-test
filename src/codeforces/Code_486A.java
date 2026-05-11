package codeforces;

import java.io.*;

public class Code_486A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        long n1 = n + 1;

        if (n1 % 2 == 0) {
            bw.write("-");
            bw.write((n1 / 2) + "");
        } else {
            bw.write((n1 / 2) + "");
        }

        bw.flush();
    }
}
