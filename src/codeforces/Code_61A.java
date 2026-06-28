package codeforces;

import java.io.*;

public class Code_61A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                bw.write("0");
            } else {
                bw.write("1");
            }
        }
        bw.flush();
    }
}
