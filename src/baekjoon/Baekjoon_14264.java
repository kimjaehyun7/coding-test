package baekjoon;

import java.io.*;

public class Baekjoon_14264 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        double S = (Math.sqrt(3) / 4) * L * L;

        bw.write(S + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
