package codeforces;

import java.io.*;

public class Code_467A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int p = Integer.parseInt(s[0]); // p명 살고있음
            int q = Integer.parseInt(s[1]); // q명 까지 수용가능

            if (q - p >= 2) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
