package baekjoon;

import java.io.*;

public class Baekjoon_17356 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        double a = Double.parseDouble(s[0]);
        double b = Double.parseDouble(s[1]);

        double m = (b - a) / 400;

        double result = 1 / (1 + Math.pow(10, m));

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
