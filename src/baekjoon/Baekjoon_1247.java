package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_1247 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger bigInteger = BigInteger.ZERO;
            BigInteger zero = BigInteger.ZERO;
            for (int j = 0; j < n; j++) {
                BigInteger num = new BigInteger(br.readLine());
                bigInteger = bigInteger.add(num);
            }
            if (bigInteger.compareTo(zero) == 0) {
                bw.write("0\n");
            } else if (bigInteger.compareTo(zero) > 0) {
                bw.write("+\n");
            } else {
                bw.write("-\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
