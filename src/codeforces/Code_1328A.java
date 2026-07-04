package codeforces;

import java.io.*;

public class Code_1328A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if (a % b == 0) {
                bw.write("0\n");
            } else {
                int ab = a + b;
                int tmp = ab % b;
                int result = b - tmp;
                bw.write(result + "\n");
            }
        }
        bw.flush();
    }
}
