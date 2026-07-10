package codeforces;

import java.io.*;

public class Code_133A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isHq = false;
        for (char c : br.readLine().toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                isHq = true;
                break;
            }
        }

        if (isHq) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
    }
}
