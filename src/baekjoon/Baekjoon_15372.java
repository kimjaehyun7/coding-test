package baekjoon;

import java.io.*;

public class Baekjoon_15372 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long square = (long) n * n;

            bw.write(square + "\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
