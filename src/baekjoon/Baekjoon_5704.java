package baekjoon;

import java.io.*;

public class Baekjoon_5704 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("*")) {
            boolean[] pangram = new boolean[26];
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    continue;
                }
                pangram[c - 'a'] = true;
            }
            boolean isPangram = true;
            for (boolean b : pangram) {
                if (!b) {
                    isPangram = false;
                }
            }
            if (isPangram) {
                bw.write("Y\n");
            } else {
                bw.write("N\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
