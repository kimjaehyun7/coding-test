package baekjoon;

import java.io.*;

public class Baekjoon_6131 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if ((int) (Math.pow(i, 2) - Math.pow(j, 2)) == n) {
                    count++;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
