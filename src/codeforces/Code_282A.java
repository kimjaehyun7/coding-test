package codeforces;

import java.io.*;

public class Code_282A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.contains("+")) {
                x++;
            } else if (s.contains("-")) {
                x--;
            }
        }

        bw.write(x + "");
        bw.flush();
    }
}
