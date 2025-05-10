package baekjoon;

import java.io.*;

public class Baekjoon_10991 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int empty = n - 1;

        for (int i = 1; i <= n; i++) {
            int star = 0;
            for (int j = 0; j < empty; j++) {
                bw.write(" ");
            }
            while (true) {
                bw.write("*");
                star++;
                if (star == i) {
                    break;
                }
                bw.write(" ");
            }
            bw.write("\n");
            empty--;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
