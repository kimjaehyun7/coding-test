package codeforces;

import java.io.*;

public class Code_131A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        boolean allUpper = true;
        boolean allUpperExceptFirstWord = true;

        for (char c : s.toCharArray()) {
            if (!(c >= 'A' && c <= 'Z')) {
                allUpper = false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                    allUpperExceptFirstWord = false;
                }
            } else {
                if (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    allUpperExceptFirstWord = false;
                }
            }
        }

        if (allUpperExceptFirstWord) {
            bw.write(String.valueOf(s.charAt(0)).toUpperCase());
            bw.write(s.toLowerCase().substring(1));
        } else if (allUpper) {
            bw.write(s.toLowerCase());
        } else {
            bw.write(s);
        }
        bw.flush();
    }
}
