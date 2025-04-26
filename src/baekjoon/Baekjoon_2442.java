package baekjoon;

import java.io.*;

public class Baekjoon_2442 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int star = 1;
        int empty = (2 * n - 2) / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < empty; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < star; j++) {
                bw.write("*");
            }
            star += 2;
            empty -= 1;
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
