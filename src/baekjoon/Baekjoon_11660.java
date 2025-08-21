package baekjoon;

import java.io.*;

public class Baekjoon_11660 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 표의 크기
        int m = Integer.parseInt(s[1]); // 합을 구해야하는 횟수
        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(split[j - 1]);
            }
        }

        int[] prefix = new int[n * n + 1];

        int row = 1;
        int col = 1;

        for (int i = 1; i <= n * n; i++) {
            prefix[i] = prefix[i - 1] + arr[row][col++];
            if (col == n + 1) {
                col = 1;
                row++;
            }
        }

        for (int i = 0; i < m; i++) {
            String[] split = br.readLine().split(" ");
            int x1 = Integer.parseInt(split[0]);
            int y1 = Integer.parseInt(split[1]);
            int x2 = Integer.parseInt(split[2]);
            int y2 = Integer.parseInt(split[3]);

            int sum = 0;
            for (int j = x1; j <= x2; j++) {
                sum += prefix[(j - 1) * n + y2] - prefix[(j - 1) * n + y1 - 1];
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
