package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_14623 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger b1 = new BigInteger(br.readLine(), 2);
        BigInteger b2 = new BigInteger(br.readLine(), 2);

        bw.write(b1.multiply(b2).toString(2));
        bw.flush();
        bw.close();
        br.close();

    }
}
