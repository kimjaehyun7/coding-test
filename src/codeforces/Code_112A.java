package codeforces;

import java.io.*;

public class Code_112A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine().toLowerCase();
        String b = br.readLine().toLowerCase();

        int result = a.compareTo(b);

        if (result > 0) {
            result = 1;
        } else if (result < 0) {
            result = -1;
        }

        bw.write(result + "");
        bw.flush();
    }
}
