package baekjoon;

import java.io.*;

public class Baekjoon_2857 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isFbi = new boolean[5];
        boolean nothing = true;


        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            if (s.contains("FBI")) {
                isFbi[i] = true;
                nothing = false;
            }
        }

        if (nothing) {
            bw.write("HE GOT AWAY!");
        } else {
            for (int i = 0; i < 5; i++) {
                if (isFbi[i]) {
                    bw.write((i + 1) + " ");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
