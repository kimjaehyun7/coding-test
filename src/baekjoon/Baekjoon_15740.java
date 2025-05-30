package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_15740 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);

        bw.write(a.add(b).toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
