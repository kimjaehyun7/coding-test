package codeforces;

import java.io.*;

public class Code_58A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String hello = "hello";
        int idx = 0;

        for (String s : br.readLine().split("")) {
            if (s.charAt(0) == hello.charAt(idx)) {
                idx++;
                if (idx == 5) {
                    break;
                }
            }
        }

        if (idx == 5) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
