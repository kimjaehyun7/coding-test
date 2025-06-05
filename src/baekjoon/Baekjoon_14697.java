package baekjoon;

import java.io.*;

public class Baekjoon_14697 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int n = Integer.parseInt(split[3]);

        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= n / b; j++) {
                for (int k = 0; k <= n / c; k++) {
                    int num = (a * i) + (b * j) + (c * k);
                    if (num == n) {
                        bw.write("1");
                        bw.flush();
                        bw.close();
                        br.close();
                        return;
                    }
                }
            }
        }

        bw.write("0");
        bw.flush();
        bw.close();
        br.close();
    }
}
