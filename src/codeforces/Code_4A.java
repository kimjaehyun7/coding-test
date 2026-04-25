package codeforces;

import java.io.*;

public class Code_4A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w = Integer.parseInt(br.readLine());

        if (w % 2 == 1 || w == 2) {
            bw.write("NO");
        } else {
            bw.write("YES");
        }

        bw.flush();
    }
}
