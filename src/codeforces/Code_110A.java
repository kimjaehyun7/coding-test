package codeforces;

import java.io.*;

public class Code_110A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        for (String s : br.readLine().split("")) {
            if (s.equals("4") || s.equals("7")) {
                count++;
            }
        }

        if (count == 4 || count == 7) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
