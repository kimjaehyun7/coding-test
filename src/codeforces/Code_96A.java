package codeforces;

import java.io.*;

public class Code_96A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String cur = "";
        for (String s : br.readLine().split("")) {
            if (cur.equals(s)) {
                count++;
                if (count == 7) {
                    break;
                }
                continue;
            }
            cur = s;
            count = 1;
        }

        if (count == 7) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
