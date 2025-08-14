package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_16428 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        BigInteger A = new BigInteger(s[0]);
        BigInteger B = new BigInteger(s[1]);

        BigInteger q = A.divide(B);
        BigInteger r = A.remainder(B);

        // 나머지가 음수일 때
        if (r.compareTo(BigInteger.ZERO) < 0) {
            // B가 양수일 때 , 음수일 때
            if (B.compareTo(BigInteger.ZERO) > 0) {
                q = q.subtract(BigInteger.ONE);
                r = r.add(B);
            } else {
                q = q.add(BigInteger.ONE);
                r = r.subtract(B);
            }
        }

        bw.write(q + "\n" + r);
        bw.flush();
        bw.close();
        br.close();
    }
}
