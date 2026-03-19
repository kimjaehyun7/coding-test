package baekjoon;

import java.io.*;

public class Baekjoon_21612 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int B = Integer.parseInt(br.readLine());

        int P = 5 * B - 400;

        if (P > 100) {
            bw.write(P + "\n-1");
        } else if (P < 100) {
            bw.write(P + "\n1");
        } else {
            bw.write(P + "\n0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
