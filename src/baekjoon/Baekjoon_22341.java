package baekjoon;

import java.io.*;

public class Baekjoon_22341 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);

        int a = n; // 세로 길이
        int b = n; // 가로 길이

        for (int i = 0; i < c; i++) {
            String[] sp = br.readLine().split(" ");
            int x = Integer.parseInt(sp[0]);
            int y = Integer.parseInt(sp[1]);

            if (x >= a || y >= b) {
                continue;
            }

            int widthCut = x * b; // 가로 컷
            int heightCut = a * y; // 세로 컷

            if (widthCut >= heightCut) {
                a = x;
            } else {
                b = y;
            }
        }

        bw.write(a * b + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
