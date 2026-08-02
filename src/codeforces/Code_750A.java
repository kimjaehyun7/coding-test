package codeforces;

import java.io.*;

public class Code_750A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int time = 240 - k;
        int cur = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int p = 5 * i;

            cur += p;

            if (time >= cur) {
                count++;
            } else {
                break;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
