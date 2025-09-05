package baekjoon;

import java.io.*;

public class Baekjoon_22938 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long x1 = Long.parseLong(s[0]);
        long y1 = Long.parseLong(s[1]);
        long r1 = Long.parseLong(s[2]);

        String[] s2 = br.readLine().split(" ");
        long x2 = Long.parseLong(s2[0]);
        long y2 = Long.parseLong(s2[1]);
        long r2 = Long.parseLong(s2[2]);

        // 두 점(중심점) 사이의 거리보다 r1+r2가 크면 겹치는 것이다.
        // 두 과녁이 한 점에서 만나는 경우는 겹치지 않는 것으로 생각하기 때문에
        // dist2 == rSum2 일 경우 NO 출력

        long dx = x2 - x1;
        long dy = y2 - y1;
        long dist2 = (dx * dx) + (dy * dy); // 루트 안씌우고 d제곱으로 계산

        long rSum = r1 + r2;
        long rSum2 = rSum * rSum;

        if (dist2 < rSum2) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
