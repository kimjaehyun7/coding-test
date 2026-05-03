package codeforces;

import java.io.*;

public class Code_281A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String first = String.valueOf(s.charAt(0)).toUpperCase();
        String sub = s.substring(1);

        bw.write(first + sub);
        bw.flush();
    }
}
