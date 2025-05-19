package baekjoon;

import java.io.*;

public class Baekjoon_10996 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean star = true;
            for (int j = 0; j < n; j++) { // 첫째 줄
                if (star) {
                    bw.write("*");
                    star = false;
                } else {
                    bw.write(" ");
                    star = true;
                }
            }
            bw.write("\n");
            star = false;
            for (int j = 0; j < n; j++) { // 둘째 줄
                if (star) {
                    bw.write("*");
                    star = false;
                } else {
                    bw.write(" ");
                    star = true;
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
