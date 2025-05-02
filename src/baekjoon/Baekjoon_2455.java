package baekjoon;

import java.io.*;

public class Baekjoon_2455 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int p = 0; // 기차 안에 있는 승객 수
        int max = 0;

        for (int i = 0; i < 4; i++) {
            String[] split = br.readLine().split(" ");
            int off = Integer.parseInt(split[0]); // 내린 사람
            int on = Integer.parseInt(split[1]); // 탄 사람

            p -= off; // 내림
            p += on; // 탐

            if (p > max) {
                max = p;
            }
        }

        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
