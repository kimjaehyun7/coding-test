package codeforces;

import java.io.*;

public class Code_69A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int xSum = 0;
        int ySum = 0;
        int zSum = 0;

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            xSum += Integer.parseInt(s[0]);
            ySum += Integer.parseInt(s[1]);
            zSum += Integer.parseInt(s[2]);

        }

        if (xSum == 0 && ySum == 0 && zSum == 0) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
