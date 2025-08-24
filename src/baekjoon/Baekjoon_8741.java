package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_8741 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        BigInteger n = BigInteger.TWO.pow(k).subtract(BigInteger.ONE);
        BigInteger result = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.TWO);
        String s = result.toString(2);

        bw.write(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
