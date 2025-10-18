package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2630 {

    static int N;
    static int white;
    static int blue;
    static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            board[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        cut(0, 0, N);

        bw.write(white + "\n" + blue);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void cut(int r, int c, int n) {
        int result = isAll(r, c, n);
        if (result == 1) {
            blue++;
            return;
        } else if (result == 0) {
            white++;
            return;
        }

        n /= 2;

        cut(r, c, n);
        cut(r, c + n, n);
        cut(r + n, c, n);
        cut(r + n, c + n, n);

    }

    private static int isAll(int r, int c, int n) {
        boolean allWhite = true;
        boolean allBlue = true;
        for (int i = r; i < n + r; i++) {
            for (int j = c; j < n + c; j++) {
                if (board[i][j] == 0) {
                    allBlue = false;
                }
                if (board[i][j] == 1) {
                    allWhite = false;
                }
            }
        }
        if (allBlue) {
            return 1;
        } else if (allWhite) {
            return 0;
        } else {
            return -1;
        }
    }
}
