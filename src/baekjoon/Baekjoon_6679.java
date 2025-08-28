package baekjoon;

import java.io.*;

public class Baekjoon_6679 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1000; i <= 9999; i++) {

            String decimal = Integer.toString(i, 10);
            String duodecimal = Integer.toString(i, 12);
            String hexadecimal = Integer.toString(i, 16);

            int decimalSum = 0;
            int duodecimalSum = 0;
            int hexSum = 0;

            for (char c : decimal.toCharArray()) {
                decimalSum += Integer.parseInt(String.valueOf(c));
            }
            for (char c : duodecimal.toCharArray()) {
                duodecimalSum += Integer.parseInt(String.valueOf(c), 12);
            }
            for (char c : hexadecimal.toCharArray()) {
                hexSum += Integer.parseInt(String.valueOf(c), 16);
            }

            if ((decimalSum == duodecimalSum) && (duodecimalSum == hexSum)) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
