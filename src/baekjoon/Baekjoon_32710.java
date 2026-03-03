package baekjoon;

import java.io.*;

public class Baekjoon_32710 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        boolean goo = false;

        if (N >= 1 && N <= 9) {
            goo = true;
        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int mul = i * j;
                if (N == mul) {
                    goo = true;
                    break;
                }
            }
            if (goo) {
                break;
            }
        }

        if (goo) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
