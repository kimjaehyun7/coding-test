package baekjoon;

import java.io.*;

public class Baekjoon_24723 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write((int) Math.pow(2, n) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
