package baekjoon;

import java.io.*;

public class Baekjoon_19602 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        int result = S + 2 * M + 3 * L;

        if (result >= 10) {
            bw.write("happy");
        } else {
            bw.write("sad");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
