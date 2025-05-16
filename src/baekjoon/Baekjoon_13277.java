package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_13277 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);

        String s = a.multiply(b).toString();

        bw.write(s);
        bw.flush();
        bw.close();
        br.close();

    }
}
