package baekjoon;

import java.io.*;

public class Baekjoon_15680 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        if (s.equals("0")) {
            bw.write("YONSEI");
        } else {
            bw.write("Leading the Way to the Future");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
