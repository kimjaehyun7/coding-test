package baekjoon;

import java.io.*;
import java.math.BigDecimal;

public class Baekjoon_2052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        BigDecimal one = BigDecimal.ONE;
        BigDecimal pow = BigDecimal.valueOf(2).pow(n);

        bw.write(one.divide(pow).toPlainString());
        bw.flush();
        bw.close();
        br.close();
    }
}
