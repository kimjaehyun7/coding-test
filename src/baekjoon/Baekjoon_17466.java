package baekjoon;

import java.io.*;

public class Baekjoon_17466 {

    static long P;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long N = Long.parseLong(s[0]);
        P = Long.parseLong(s[1]);

        long result = 1;

        for (int i = 2; i <= N; i++) {
            result = (result * i) % P;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
