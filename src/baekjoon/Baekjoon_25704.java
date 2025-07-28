package baekjoon;

import java.io.*;

public class Baekjoon_25704 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int price = coupon(n, p);
        if (price < 0) {
            price = 0;
        }

        bw.write(price + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int coupon(int n, int p) {
        if (n < 5) {
            return p;
        } else if (n < 10) {
            return p - 500;
        } else if (n < 15) {
            int a = p - 500;
            int b = p * 9 / 10;
            return Math.min(a, b);
        } else if (n < 20) {
            int a = p - 500;
            int b = p * 9 / 10;
            int c = p - 2000;
            return Math.min(Math.min(a, b), c);
        } else {
            int a = p - 500;
            int b = p * 9 / 10;
            int c = p - 2000;
            int d = p * 75 / 100;
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }
}
