package baekjoon;

import java.io.*;

public class Baekjoon_13136 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        long r = Integer.parseInt(s[0]);
        long c = Integer.parseInt(s[1]);
        long n = Integer.parseInt(s[2]);

        long x;
        long y;

        if (c % n == 0) {
            x = c / n;
        } else {
            x = c / n + 1;
        }

        if (r % n == 0) {
            y = r / n;
        } else {
            y = r / n + 1;
        }

        bw.write(x * y + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
