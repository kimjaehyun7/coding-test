package baekjoon;

import java.io.*;

public class Baekjoon_11444 {

    static int P = 1_000_000_007;
    static long[][] arr = {{1, 1}, {1, 0}};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        if (n == 0) {
            bw.write("0");
        } else {
            long[][] result = pow(n);

            bw.write(result[0][1] + "");

        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static long[][] pow(long n) {
        if (n == 1) {
            return arr;
        }
        long[][] mid = pow(n / 2);
        if (n % 2 == 0) {
            return mul(mid, mid);
        } else {
            return mul(mul(mid, mid), arr);
        }
    }

    private static long[][] mul(long[][] a, long[][] b) {
        long[][] result = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                long sum = 0;
                for (int k = 0; k < 2; k++) {
                    sum += (a[i][k] * b[k][j]) % P;
                }
                result[i][j] = sum % P;
            }
        }
        return result;
    }
}
