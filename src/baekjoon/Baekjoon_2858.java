package baekjoon;

import java.io.*;

public class Baekjoon_2858 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int R = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int RB = R + B;
        int L = 0;
        int W = 0;
        for (int i = 1; i <= RB; i++) {
            if (RB % i == 0) {
                int w = RB / i;
                int h = i;
                if ((w - 2) * (h - 2) == B) {
                    L = Math.max(w, h);
                    W = Math.min(w, h);
                    break;
                }
            }
        }
        bw.write(L + " " + W);
        bw.flush();
        bw.close();
        br.close();
    }
}
