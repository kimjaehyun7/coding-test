package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_5988 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            BigInteger num = new BigInteger(br.readLine());
            BigInteger remainder = num.remainder(BigInteger.TWO);
            if (remainder.intValue() == 0) {
                bw.write("even\n");
            } else {
                bw.write("odd\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
