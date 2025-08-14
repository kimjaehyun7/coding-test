package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_11816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String x = br.readLine();

        BigInteger result;

        if (x.startsWith("0x")) {
            x = x.substring(2);
            result = new BigInteger(x, 16);
        } else if (x.startsWith("0")) {
            x = x.substring(1);
            result = new BigInteger(x, 8);
        } else {
            result = new BigInteger(x);
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
