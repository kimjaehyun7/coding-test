package baekjoon;

import java.io.*;

public class Baekjoon_2523 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int star = 1;
        boolean change = false;

        for (int i = 0; i < 2 * n - 1; i++) {
            if (star == n) {
                change = true;
            }
            if (!change) {
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                star++;
            } else {
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
                star--;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
