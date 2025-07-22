package baekjoon;

import java.io.*;

public class Baekjoon_5217 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int j = 1; j <= 11; j++) {
                for (int k = j + 1; k <= 12; k++) {
                    if (j + k == n) {
                        sb.append(" " + j + " " + k + ",");
                    }
                }
            }

            if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            bw.write("Pairs for " + n + ":" + sb + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
