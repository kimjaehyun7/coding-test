package codeforces;

import java.io.*;

public class Code_1669A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int rating = Integer.parseInt(br.readLine());

            if (rating >= 1900) {
                bw.write("Division 1\n");
            } else if (rating >= 1600) {
                bw.write("Division 2\n");
            } else if (rating >= 1400) {
                bw.write("Division 3\n");
            } else {
                bw.write("Division 4\n");
            }
        }
        bw.flush();
    }
}
