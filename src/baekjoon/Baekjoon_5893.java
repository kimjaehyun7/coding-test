package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_5893 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String binary = br.readLine();

        BigInteger decimal = new BigInteger(binary, 2);
        BigInteger multiplied = decimal.multiply(BigInteger.valueOf(17));

        bw.write(multiplied.toString(2));
        bw.flush();
        bw.close();
        br.close();

    }
}
