package codeforces;

import java.io.*;

public class Code_1703A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine().toLowerCase();

            if (s.equals("yes")) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
