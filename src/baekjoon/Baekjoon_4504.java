package baekjoon;

import java.io.*;

public class Baekjoon_4504 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (true) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0) {
                break;
            }

            if (m % n == 0) {
                bw.write(m + " is a multiple of " + n + ".\n");
            } else {
                bw.write(m + " is NOT a multiple of " + n + ".\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
