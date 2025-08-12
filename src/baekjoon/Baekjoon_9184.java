package baekjoon;

import java.io.*;

public class Baekjoon_9184 {

    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("-1 -1 -1")) {
            String[] split = s.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);

            int result = w(a, b, c);
            bw.write(String.format("w(%d, %d, %d) = %d\n", a, b, c, result));
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;

        if (a > 20 || b > 20 || c > 20) return w(20, 20, 20);

        if (dp[a][b][c] != 0) {
            return dp[a][b][c];
        }
        if (a < b && b < c) {
            dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        return dp[a][b][c];
    }
}
