package baekjoon;

import java.io.*;

public class Baekjoon_3053 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double pi = Math.PI;
        double circle = n * n * pi;
        double taxi = 2 * n * n;

        bw.write(String.format("%.6f", round(circle))+"\n");
        bw.write(String.format("%.6f",taxi));
        bw.flush();
        bw.close();
        br.close();

    }

    private static double round(double d) {
        return Math.round(d * 1000000) / 1000000.0;
    }
}
