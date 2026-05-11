package codeforces;

import java.io.*;

public class Code_41A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String t = br.readLine();

        boolean same = true;
        if (s.length() != t.length()) {
            same = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(s.length() - 1 - i)) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
