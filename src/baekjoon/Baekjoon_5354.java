package baekjoon;

import java.io.*;

public class Baekjoon_5354 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(br.readLine());

            for (int k = 0; k < j; k++) {
                for (int l = 0; l < j; l++) {
                    if (k == 0 || k == j - 1 || l == 0 || l == j - 1) {
                        bw.write("#");
                    } else {
                        bw.write("J");
                    }
                }
                bw.write("\n");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
