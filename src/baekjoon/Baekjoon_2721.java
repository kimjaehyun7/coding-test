package baekjoon;

import java.io.*;

public class Baekjoon_2721 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += j * ((j + 1) * (j + 2) / 2);
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
