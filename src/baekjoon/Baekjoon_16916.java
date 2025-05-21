package baekjoon;

import java.io.*;

public class Baekjoon_16916 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String p = br.readLine();

        if (kmp(s, p)) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean kmp(String s, String pattern) {
        int[] pi = makePi(pattern);
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (s.charAt(i) == pattern.charAt(j)) {
                j++;
                if (j == pattern.length()) { // pattern 과 일치
                    return true;
                }
            }
        }
        return false;
    }


    private static int[] makePi(String pattern) {
        int[] pi = new int[pattern.length()];
        int j = 0;

        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
}
