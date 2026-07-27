package codeforces;

import java.io.*;

public class Code_1899A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if ((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
                bw.write("First\n");
            } else {
                bw.write("Second\n");
            }
        }
        bw.flush();
    }
}
