package baekjoon;

import java.io.*;

public class Baekjoon_1333 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int l = Integer.parseInt(split[1]);
        int d = Integer.parseInt(split[2]);
        int loop = n + (n-1); // 곡 수 + 조용한 구간

        bw.write(getTime(loop, l, d) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getTime(int loop, int l, int d) {
        int time = 0;
        for (int i = 0; i < loop; i++) {
            if (i % 2 == 0) { // 노래 재생
                for (int j = 0; j < l; j++) {
                    time++;
                }
            }else { // 노래 사이 딜레이 5초 구간
                for (int j = 0; j < 5; j++) {
                    if (time % d == 0) {
                        return time;
                    }
                    time++;
                }
            }
        }
        while (true) { // 앨범 듣는 사이에 못 들었을 때
            if (time % d == 0) {
                return time;
            }
            time++;

        }
    }
}
