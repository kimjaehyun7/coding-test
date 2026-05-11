package codeforces;

import java.io.*;

public class Code_200B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double d = 0;
        for (String s : br.readLine().split(" ")) {
            d += Double.parseDouble(s);
        }
        d /= 100;

        double result = (d / n) * 100;

        String format = String.format("%.12f", result);

        bw.write(format);
        bw.flush();
    }
}
