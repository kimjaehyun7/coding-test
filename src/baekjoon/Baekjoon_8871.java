package baekjoon;

import java.io.*;

public class Baekjoon_8871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()) + 1;

        bw.write((n * 2) + " " + (n * 3));
        bw.flush();
        bw.close();
        br.close();
    }
}
