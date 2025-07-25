package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_1010 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String[] s = br.readLine().split(" ");

            BigInteger n = BigInteger.valueOf(Integer.parseInt(s[0]));
            BigInteger m = BigInteger.valueOf(Integer.parseInt(s[1]));

            // m개 중에 n개를 선택하는 경우의 수 (이항계수) m! / n! * (m-n)!

            BigInteger nFac = factorial(BigInteger.ONE, n);
            BigInteger mFac = factorial(BigInteger.ONE, m);
            BigInteger mSubNFac = factorial(BigInteger.ONE, m.subtract(n));
            BigInteger result = mFac.divide(nFac.multiply(mSubNFac));

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static BigInteger factorial(BigInteger left, BigInteger right) {
        if (left.add(BigInteger.ONE).equals(right)) return left.multiply(right); // 1차이 날 때
        if (left.equals(right)) return left; // 같을 때
        if (right.equals(BigInteger.ZERO)) return BigInteger.ONE; // 0! -> 1

        BigInteger mid = left.add(right).divide(BigInteger.TWO);
        return factorial(left, mid).multiply(factorial(mid.add(BigInteger.ONE), right));
    }
}
