package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_2338 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger num1 = new BigInteger(br.readLine());
        BigInteger num2 = new BigInteger(br.readLine());

        bw.write(
                num1.add(num2) + "\n" +
                        num1.subtract(num2) + "\n" +
                        num1.multiply(num2)
        );

        bw.flush();
        bw.close();
        br.close();

    }

}
