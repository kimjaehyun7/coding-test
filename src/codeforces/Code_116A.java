package codeforces;

import java.io.*;

public class Code_116A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int max = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            cur -= a;
            cur += b;

            max = Math.max(max, cur);
        }

        bw.write(max + "");
        bw.flush();
    }
}
