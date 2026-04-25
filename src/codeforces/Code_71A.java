package codeforces;

import java.io.*;

public class Code_71A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.length() <= 10) {
                bw.write(s + "\n");
            } else {
                bw.write(s.charAt(0) + "");
                int len = s.length() - 2;
                bw.write(len + "");
                bw.write(s.charAt(s.length() - 1) + "\n");
            }
        }
        bw.flush();
    }
}
