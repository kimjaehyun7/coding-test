package baekjoon;

import java.io.*;

public class Baekjoon_15439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write((n - 1) * n + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
