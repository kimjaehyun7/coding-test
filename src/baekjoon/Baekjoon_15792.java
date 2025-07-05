package baekjoon;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Baekjoon_15792 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        BigDecimal a = new BigDecimal(Double.parseDouble(arr[0]));
        BigDecimal b = new BigDecimal(Double.parseDouble(arr[1]));

        BigDecimal result = a.divide(b, 1000, RoundingMode.HALF_UP);

        bw.write(result.stripTrailingZeros().toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
