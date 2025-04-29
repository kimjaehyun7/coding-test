package baekjoon;

import java.io.*;

public class Baekjoon_2445 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int star = 1;
        int empty = 2 * n - 2;
        boolean change = false;

        for (int i = 0; i < 2 * n - 1; i++) {
            if (empty == 0) {
                change = true;
            }
            if (!change) {
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                for (int j = 0; j < empty; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                star++;
                empty -= 2;
            } else {
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                for (int j = 0; j < empty; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                star--;
                empty += 2;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
