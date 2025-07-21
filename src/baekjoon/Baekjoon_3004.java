package baekjoon;

import java.io.*;

public class Baekjoon_3004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int max = 2;
        int piece = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                piece++;
            }
            max += piece;
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
