package baekjoon;

import java.io.*;

public class Baekjoon_14652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]) + 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count++;
                if (count == k) {
                    bw.write(i + " " + j);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
