package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_1271 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        BigInteger n = new BigInteger(split[0]);
        BigInteger m = new BigInteger(split[1]);

        BigInteger[] result = n.divideAndRemainder(m);
        bw.write(result[0] + "\n");
        bw.write(result[1] + "");


        bw.flush();
        bw.close();
        br.close();

    }
}
