package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_2061 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        BigInteger K = new BigInteger(arr[0]);
        int L = Integer.parseInt(arr[1]);
        boolean isGood = true;
        int badNum = 0;

        for (int i = 2; i < L; i++) {
            if (K.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                isGood = false;
                badNum = i;
                break;
            }
        }
        if (isGood) {
            bw.write("GOOD");
        } else {
            bw.write("BAD " + badNum);
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
