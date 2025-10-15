package baekjoon;

import java.io.*;

public class Baekjoon_28295 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dir = 0;
        for (int i = 0; i < 10; i++) {
            int t = Integer.parseInt(br.readLine());

            if (t == 3) {
                dir -= 1;
                if (dir == -1) {
                    dir = 3;
                }
            } else {
                dir += t;
            }
            dir %= 4;
        }

        if (dir == 0) {
            bw.write("N");
        } else if (dir == 1) {
            bw.write("E");
        } else if (dir == 2) {
            bw.write("S");
        } else {
            bw.write("W");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
