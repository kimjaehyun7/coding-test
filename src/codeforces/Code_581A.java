package codeforces;

import java.io.*;

public class Code_581A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int second = (max - min) / 2;

        bw.write(min + " " + second);
        bw.flush();
    }
}
