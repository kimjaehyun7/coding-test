package baekjoon;

import java.io.*;

public class Baekjoon_31654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        if (a + b == c) {
            bw.write("correct!");
        } else {
            bw.write("wrong!");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
