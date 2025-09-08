package baekjoon;

import java.io.*;

public class Baekjoon_13304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] room = new int[5]; // 1~2학년방, 3~4학년 여학생 방, 3~4학년 남학생 방 , 5~6 여, 5~6 남
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]); // 수학여행 참가 학생 수
        int k = Integer.parseInt(split[1]); // 한 방에 배정 가능한 최대 인원 수
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split(" ");
            int s = Integer.parseInt(sp[0]); // 성별 0=여학생, 1=남학생
            int y = Integer.parseInt(sp[1]); // 학년

            if (y <= 2) {
                room[0]++;
            } else if (y == 3 || y == 4) {
                if (s == 0) {
                    room[1]++;
                } else {
                    room[2]++;
                }
            } else {
                if (s == 0) {
                    room[3]++;
                } else {
                    room[4]++;
                }
            }
        }

        for (int i : room) {
            count += (i + k - 1) / k;
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
