package baekjoon;

import java.io.*;

public class Baekjoon_13235 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse)) {
            bw.write("true");
        } else {
            bw.write("false");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
