package baekjoon;

import java.io.*;

public class Baekjoon_10990 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int empty = n - 2;
        int empty2 = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j < empty + 1; j++) {
                    bw.write(" ");
                }
                bw.write("*");
            } else {
                for (int j = 0; j < empty; j++) {
                    bw.write(" ");
                }
                bw.write("*");
                for (int j = 0; j < empty2; j++) {
                    bw.write(" ");
                }
                bw.write("*");
                empty -= 1;
                empty2 += 2;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
