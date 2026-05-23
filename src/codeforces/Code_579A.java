package codeforces;

import java.io.*;

public class Code_579A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int result = 0;

        while (x > 0) {
            result += x % 2;
            x /= 2;
        }

        bw.write(result + "");
        bw.flush();
    }
}
