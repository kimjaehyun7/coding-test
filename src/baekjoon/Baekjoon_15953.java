package baekjoon;

import java.io.*;

public class Baekjoon_15953 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int prize = code2017(a) + code2018(b);
            bw.write(prize+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static int code2017(int a) {
        if (a == 1) {
            return 5000000;
        } else if (a == 2 || a == 3) {
            return 3000000;
        } else if (a >= 4 && a <= 6) {
            return 2000000;
        } else if (a >= 7 && a <= 10) {
            return 500000;
        } else if (a >= 11 && a <= 15) {
            return 300000;
        } else if (a >= 16 && a <= 21) {
            return 100000;
        } else {
            return 0;
        }
    }

    private static int code2018(int b) {
        if (b == 1) {
            return 5120000;
        } else if (b == 2 || b == 3) {
            return 2560000;
        } else if (b >= 4 && b <= 7) {
            return 1280000;
        } else if (b >= 8 && b <= 15) {
            return 640000;
        } else if (b >= 16 && b <= 31) {
            return 320000;
        } else {
            return 0;
        }
    }
}
