package baekjoon;

import java.io.*;

public class Baekjoon_18883 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    bw.write(count++ + "");
                    break;
                }
                bw.write(count++ + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
