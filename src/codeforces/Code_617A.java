package codeforces;

import java.io.*;

public class Code_617A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        if (x % 5 == 0) {
            bw.write((x / 5) + "");
        } else {
            bw.write((x / 5 + 1) + "");
        }
        bw.flush();
    }
}
