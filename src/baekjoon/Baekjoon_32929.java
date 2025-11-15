package baekjoon;

import java.io.*;

public class Baekjoon_32929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        if (x % 3 == 2) {
            bw.write("O");
        } else if (x % 3 == 1) {
            bw.write("U");
        } else {
            bw.write("S");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
