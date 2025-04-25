package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_10757 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        BigInteger num1 = new BigInteger(split[0]);
        BigInteger num2 = new BigInteger(split[1]);

        bw.write(num1.add(num2).toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
