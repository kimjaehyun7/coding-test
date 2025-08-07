package baekjoon;

import java.io.*;

public class Baekjoon_3943 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int max = n;

            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (n * 3) + 1;
                }
                max = Math.max(max, n);
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
