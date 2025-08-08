package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_2729 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");

            String s1 = s[0];
            String s2 = s[1];

            BigInteger b1 = new BigInteger(s1, 2);
            BigInteger b2 = new BigInteger(s2, 2);

            BigInteger add = b1.add(b2);
            String result = add.toString(2);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
