package codeforces;

import java.io.*;

public class Code_344A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int group = 1;

        int cur = 2;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if (cur == a) {
                group++;
            }
            cur = b;
        }

        bw.write(group + "");
        bw.flush();
    }
}
