package baekjoon;

import java.io.*;

public class Baekjoon_6376 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("n e\n" +
                "- -----------\n");
        bw.write("0 1\n");

        double sum = 1.0;
        double fac = 1.0; // 0! -> 1

        for (int i = 1; i <= 9; i++) {
            fac *= i;
            sum = sum + 1 / fac;

            if (i == 1) {
                bw.write(i + " " + (int) sum + "\n");
            } else if (i >= 3) {
                bw.write(String.format("%d %.9f\n", i, sum));
            } else {
                bw.write(i + " " + sum + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
