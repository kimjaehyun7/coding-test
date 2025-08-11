package baekjoon;

import java.io.*;

public class Baekjoon_5586 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int joi = 0;
        int ioi = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'J') {
                if (s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                    joi++;
                }
            } else if (s.charAt(i) == 'I') {
                if (s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                    ioi++;
                }
            }
        }

        bw.write(joi + "\n" + ioi);
        bw.flush();
        bw.close();
        br.close();
    }
}
