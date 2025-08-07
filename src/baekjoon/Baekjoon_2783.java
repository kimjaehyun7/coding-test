package baekjoon;

import java.io.*;

public class Baekjoon_2783 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        // x 그램 당 y 원
        double x = Double.parseDouble(a[0]);
        double y = Double.parseDouble(a[1]);
        double min = x * (1000 / y);

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] c = br.readLine().split(" ");

            double xi = Double.parseDouble(c[0]);
            double yi = Double.parseDouble(c[1]);

            double price = xi * (1000 / yi);

            min = Math.min(min, price);
        }
        min = Math.round(min * 100) / 100.0;

        String s = String.format("%.2f", min);

        bw.write(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
