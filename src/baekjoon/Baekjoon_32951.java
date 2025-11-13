package baekjoon;

import java.io.*;

public class Baekjoon_32951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(n - 2024 + "");

        bw.flush();
        bw.close();
        br.close();

    }
}
