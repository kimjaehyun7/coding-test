package baekjoon;

import java.io.*;

public class Baekjoon_10992 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int star = 1;
        int empty = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < empty; j++) {
                bw.write(" ");
            }
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
            } else {
                for (int j = 0; j < star; j++) {
                    if (j == 0 || j == star - 1) {
                        bw.write("*");
                    } else {
                        bw.write(" ");
                    }
                }
            }
            bw.write("\n");
            star += 2;
            empty -= 1;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
