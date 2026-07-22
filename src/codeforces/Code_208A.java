package codeforces;

import java.io.*;

public class Code_208A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split("WUB");

        for (String string : s) {
            if (!string.isEmpty()) {
                bw.write(string + " ");
            }
        }
        bw.flush();
    }
}
