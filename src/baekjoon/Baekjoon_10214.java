package baekjoon;

import java.io.*;

public class Baekjoon_10214 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int y = 0;
            int k = 0;
            for (int j = 0; j < 9; j++) {
                String[] split = br.readLine().split(" ");
                y += Integer.parseInt(split[0]);
                k += Integer.parseInt(split[1]);
            }
            if (y == k) {
                bw.write("Draw");
            } else if (y > k) {
                bw.write("Yonsei");
            } else {
                bw.write("Korea");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
