package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_141A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        String ab = a + b;
        char[] abArr = ab.toCharArray();
        Arrays.sort(abArr);

        String c = br.readLine();
        char[] cArr = c.toCharArray();
        Arrays.sort(cArr);

        boolean name = true;
        if (abArr.length == cArr.length) {
            for (int i = 0; i < abArr.length; i++) {
                if (abArr[i] != cArr[i]) {
                    name = false;
                    break;
                }
            }
        } else {
            name = false;
        }

        if (name) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
    }
}
