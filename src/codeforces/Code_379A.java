package codeforces;

import java.io.*;

public class Code_379A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int result = a;

        while (a / b != 0) {
            result += a / b;
            a = (a / b) + (a % b);
        }

        bw.write(result + "");
        bw.flush();
    }
}
