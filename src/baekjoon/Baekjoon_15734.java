package baekjoon;

import java.io.*;

public class Baekjoon_15734 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int L = Integer.parseInt(s[0]);
        int R = Integer.parseInt(s[1]);
        int A = Integer.parseInt(s[2]);

        while (A > 0) {
            if (L > R) {
                R++;
                A--;
            } else if (L < R) {
                L++;
                A--;
            } else {
                L++;
                A--;
            }
        }

        int min = Math.min(L, R);

        bw.write((min * 2) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
