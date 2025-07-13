package baekjoon;

import java.io.*;

public class Baekjoon_22864 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]); // 시간당 피로도
        int b = Integer.parseInt(arr[1]); // 시간당 일처리
        int c = Integer.parseInt(arr[2]); // 한시간 휴식당 줄어드는 피로도 양
        int m = Integer.parseInt(arr[3]); // 피로도가 m을 넘으면 안됨.

        int total = 0; // 총 일한 양
        int current = 0; // 현재 피로도

        for (int i = 0; i < 24; i++) {
            current += a;

            if (current > m) {
                current -= a + c;
                if (current < 0) {
                    current = 0;
                }
                continue;
            }
            total += b;
        }

        bw.write(total + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
