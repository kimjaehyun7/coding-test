package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1931 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] meeting = new int[n][2]; // 시작시간,끝나는시간 저장
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            meeting[i][0] = Integer.parseInt(s[0]);
            meeting[i][1] = Integer.parseInt(s[1]);
        }

        // 정렬기준
        // 1순위 - 가장 빨리 끝나는 시간
        // 2순위 - 가장 빨리 시작하는 시간
        Arrays.sort(meeting, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;
        int current = 0; // 현재 시간 ( 0에서 시작 )
        for (int[] meet : meeting) {
            if (current <= meet[0]) {
                count++;
                current = meet[1]; // 끝난 시간을 현재 시간에 저장
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
