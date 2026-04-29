package codeforces;

import java.io.*;

public class Code_263A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        outer:
        for (int i = 0; i < 5; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                if (s[j].equals("1")) {
                    result += Math.abs(i - 2) + Math.abs(j - 2);
                    break outer;
                }
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}
