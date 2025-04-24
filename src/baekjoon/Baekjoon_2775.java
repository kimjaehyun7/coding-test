package baekjoon;

import java.io.*;

public class Baekjoon_2775 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[k+1][n]; // 0층까지 추가

            for (int j = 0; j < n; j++) {
                arr[0][j] = j+1;
            }

            for (int j = 1; j <= k; j++) {
                for (int l = 0; l < n; l++) {
                    for (int m = 0; m <= l; m++) {
                        arr[j][l] += arr[j-1][m];
                    }
                }
            }
            bw.write(arr[k][n - 1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
