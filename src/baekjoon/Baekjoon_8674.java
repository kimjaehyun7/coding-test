package baekjoon;

import java.io.*;

public class Baekjoon_8674 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);

        if (a % 2 == 0 || b % 2 == 0) {
            bw.write("0");
        } else {
            bw.write(Math.min(a, b) + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
