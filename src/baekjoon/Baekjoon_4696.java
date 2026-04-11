package baekjoon;

import java.io.*;

public class Baekjoon_4696 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            double d = Double.parseDouble(s);

            double sacks = d * d;
            double cats = d * d * d;
            double kittens = d * d * d * d;

            double result = 1 + d + sacks + cats + kittens;

            String formatted = String.format("%.2f", result);

            bw.write(formatted + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
