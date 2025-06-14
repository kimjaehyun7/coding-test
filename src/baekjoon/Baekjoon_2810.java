package baekjoon;

import java.io.*;

public class Baekjoon_2810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cupHolder = 0;

        for (char c : br.readLine().toCharArray()) {
            if (c == 'S') {
                cupHolder += 2;
            } else {
                cupHolder += 1;
            }
        }
        cupHolder = cupHolder / 2 + 1;

        if (cupHolder > n) {
            bw.write(n + "");
        } else {
            bw.write(cupHolder + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
