package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_520A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().toLowerCase().split("");
        Arrays.sort(s);

        char c = 'a';

        for (String str : s) {
            char ch = str.charAt(0);
            if (c == ch) {
                c++;
            }
        }

        if (c == '{') {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
