package baekjoon;

import java.io.*;

public class Baekjoon_11006 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]); // 다리 수
            int m = Integer.parseInt(arr[1]); // 닭의 수

            for (int j = 1; j <= m; j++) {
                if (n - (j * 2) == m - j) {
                    bw.write(m - j + " " + j + "\n");
                    break;
                } else if (n == m) {
                    bw.write(m + " 0\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
