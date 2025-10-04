package baekjoon;

import java.io.*;

public class Baekjoon_10419 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(br.readLine());
            int t = 0; // 최대 시간

            for (int j = 1; j <= d / 2; j++) {
                if (j + Math.pow(j, 2) <= d) {
                    t = j;
                }
            }
            bw.write(t + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
