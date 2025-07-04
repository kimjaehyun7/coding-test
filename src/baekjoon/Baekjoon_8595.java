package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_8595 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger hidden = BigInteger.ZERO;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num >= 0 && num <= 9) {
                sb.append(num);
            } else {
                if (sb.length() != 0) {
                    if (sb.length() >= 7) {
                        sb.delete(0, sb.length());
                    } else {
                        BigInteger value = new BigInteger(sb.toString());
                        hidden = hidden.add(value);
                        sb.delete(0, sb.length());
                    }
                }
            }
        }
        if (sb.length() != 0) {
            if (sb.length() >= 7) {
                sb.delete(0, sb.length());
            } else {
                BigInteger value = new BigInteger(sb.toString());
                hidden = hidden.add(value);
                sb.delete(0, sb.length());
            }
        }

        bw.write(hidden + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
