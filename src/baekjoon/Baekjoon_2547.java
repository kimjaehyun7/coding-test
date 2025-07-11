package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_2547 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            br.readLine();
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;

            for (int j = 0; j < n; j++) {
                BigInteger candy = BigInteger.valueOf(Long.parseLong(br.readLine()));

                sum = sum.add(candy);
            }

            if (sum.remainder(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
