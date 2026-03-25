package baekjoon;

import java.io.*;

public class Baekjoon_14624 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N % 2 == 0) {
            bw.write("I LOVE CBNU");
        } else {
            for (int i = 0; i < N; i++) {
                bw.write("*");
            }
            bw.write("\n");
            for (int i = 0; i < N / 2; i++) {
                bw.write(" ");
            }
            bw.write("*\n");

            int leftEmpty = N / 2 - 1;
            int rightEmpty = 1;

            while (leftEmpty != -1) {
                for (int i = 0; i < leftEmpty; i++) {
                    bw.write(" ");
                }
                bw.write("*");
                for (int i = 0; i < rightEmpty; i++) {
                    bw.write(" ");
                }
                bw.write("*\n");

                leftEmpty--;
                rightEmpty += 2;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
