package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_15829 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] charArray = br.readLine().toCharArray();
        BigInteger hash = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(31);

        for (int i = 0; i < n; i++) {
            BigInteger a = BigInteger.valueOf((charArray[i] - '`'));
            BigInteger pow = base.pow(i);
            hash = hash.add(a.multiply(pow));
        }
        BigInteger remainder = hash.remainder(BigInteger.valueOf(1234567891));
        bw.write(remainder + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
