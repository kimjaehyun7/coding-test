package baekjoon;

import java.io.*;

public class Baekjoon_23971 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        int h = Integer.parseInt(split[0]); // 행
        int w = Integer.parseInt(split[1]); // 열
        int n = Integer.parseInt(split[2]); // 세로
        int m = Integer.parseInt(split[3]); // 가로

        int np = h % (n + 1) == 0 ? h / (n + 1) : h / (n + 1) + 1; // 세로 최대 인원
        int mp = w % (m + 1) == 0 ? w / (m + 1) : w / (m + 1) + 1; // 가로 최대 인원

        bw.write(np * mp + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
