package baekjoon;

import java.io.*;

public class Baekjoon_2033 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s);
        double d = 10.0;

        for (int i = 1; i < s.length(); i++) {
            n = (int) Math.round(n / d) * (int) d;
            d *= 10;
        }
        bw.write(n+"");



        bw.flush();
        bw.close();
        br.close();

    }

}
