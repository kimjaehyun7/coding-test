package codeforces;

import java.io.*;

public class Code_546A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]); // 초기 바나나 가격
        int n = Integer.parseInt(s[1]); // n달러 보유
        int w = Integer.parseInt(s[2]); // 구매하려는 바나나 개수

        int price = 0;
        for (int i = 1; i <= w; i++) {
            price += (i * k);
        }

        int result = 0;
        if (price > n) {
            result = (price - n);
        }

        bw.write(result + "");
        bw.flush();
    }
}
