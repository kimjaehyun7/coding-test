package codeforces;

import java.io.*;

public class Code_791A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int result = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            result++;
        }

        bw.write(result + "");
        bw.flush();
    }
}
