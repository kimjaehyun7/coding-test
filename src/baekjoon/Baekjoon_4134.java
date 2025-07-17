package baekjoon;

import java.io.*;

public class Baekjoon_4134 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            long m = Long.parseLong(br.readLine());

            while (true) {
                if (isPrime(m)) {
                    bw.write(m + "\n");
                    break;
                }
                m++;
            }



        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(long m) {
        if (m < 2) return false;
        if (m == 2) return true;
        if (m % 2 == 0) return false; // 2를 제외하면 모든 짝수가 소수가 아님.

        for (int i = 3; (long) i * i <= m; i += 2) {
            if (m % i == 0) return false;
        }
        return true;
    }
}
