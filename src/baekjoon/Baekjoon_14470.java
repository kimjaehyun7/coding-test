package baekjoon;

import java.io.*;

public class Baekjoon_14470 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 원래 고기 온도
        int b = Integer.parseInt(br.readLine()); // 목표 온도
        int c = Integer.parseInt(br.readLine()); // 얼어있는 고기 1도 데우는 시간
        int d = Integer.parseInt(br.readLine()); // 얼어있는 고기 해동하는데 걸리는 시간
        int e = Integer.parseInt(br.readLine()); // 얼어있지 않은 고기 1도 데우는 시간

        if (a > 0) { // 처음부터 녹아있는 경우
            bw.write((b - a) * e + "");
        } else {
            bw.write(((Math.abs(a) * c) + (b * e) + d) + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
