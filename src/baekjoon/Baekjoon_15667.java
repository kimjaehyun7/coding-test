package baekjoon;

import java.io.*;

public class Baekjoon_15667 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i < n; i++) {
            if (i * i > n) {
                bw.write(i - 1 + "");
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
