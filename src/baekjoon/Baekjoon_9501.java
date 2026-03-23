package baekjoon;

import java.io.*;

public class Baekjoon_9501 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]); // 우주선의 개수
            int D = Integer.parseInt(s[1]); // 목적지 까지의 거리
            int count = 0;

            for (int j = 0; j < N; j++) {
                String[] sp = br.readLine().split(" ");
                double v = Double.parseDouble(sp[0]); // 우주선 최고속도
                double f = Double.parseDouble(sp[1]); // 우주선 연료양
                double c = Double.parseDouble(sp[2]); // 우주선 연료소비율

                double d = v * (f / c);

                if (D <= d) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
