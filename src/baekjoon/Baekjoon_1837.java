package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_1837 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        BigInteger p = new BigInteger(split[0]);
        int k = Integer.parseInt(split[1]);

        for (int i = 2; i < k; i++) {
            if (p.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                bw.write("BAD " + i);
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }
        bw.write("GOOD");
        bw.flush();
        bw.close();
        br.close();

    }
}
