package baekjoon;

import java.io.*;

public class Baekjoon_32384 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write("LoveisKoreaUniversity ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
