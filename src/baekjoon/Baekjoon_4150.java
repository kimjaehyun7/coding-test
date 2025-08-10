package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_4150 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(fibonacci(Integer.parseInt(br.readLine())) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static BigInteger fibonacci(int n) {
        if (n==0) return BigInteger.ZERO;
        if (n==1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }
}
