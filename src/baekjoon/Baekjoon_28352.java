package baekjoon;

import java.io.*;

public class Baekjoon_28352 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long result = 6;

        for (int i = 11; i <= N; i++) {
            result *= i;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
