package baekjoon;

import java.io.*;

public class Baekjoon_1977 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 100; j++) {
                if (Math.sqrt(i) == j) {
                    sum += i;
                    if (i < min) {
                        min = i;
                    }
                }
            }
        }
        if (sum != 0) {
            bw.write(sum + "\n" + min);
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
