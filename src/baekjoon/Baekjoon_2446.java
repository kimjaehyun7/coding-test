package baekjoon;

import java.io.*;

public class Baekjoon_2446 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int star = 2 * n - 1;
        int empty = 0;
        boolean change = false;

        for (int i = 0; i < 2 * n - 1; i++) {
            if (star == 1) {
                change = true;
            }
            if (!change) {
                for (int j = 0; j < empty; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                bw.write("\n");
                star -= 2;
                empty++;
            } else {
                for (int j = 0; j < empty; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                bw.write("\n");
                star += 2;
                empty--;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
