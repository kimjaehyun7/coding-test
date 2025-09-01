package baekjoon;

import java.io.*;

public class Baekjoon_5612 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 조사한 시간
        int m = Integer.parseInt(br.readLine()); // 터널 안의 차량 수
        int max = m;

        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            int j = Integer.parseInt(s[0]); // 입구 통과 차량 수
            int k = Integer.parseInt(s[1]); // 출구 통과 차량 수

            m += j;
            m -= k;
            if (m < 0) {
                max = 0;
                break;
            }
            max = Math.max(max, m);
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
