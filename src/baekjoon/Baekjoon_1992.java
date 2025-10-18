package baekjoon;

import java.io.*;

public class Baekjoon_1992 {

    static int N;
    static char[][] board;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        makeQuad(0, 0, N);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void makeQuad(int r, int c, int n) {
        if (valid(r, c, n)) {
            sb.append(board[r][c]);
            return;
        }
        n /= 2;

        sb.append("(");

        makeQuad(r, c, n);
        makeQuad(r, c + n, n);
        makeQuad(r + n, c, n);
        makeQuad(r + n, c + n, n);

        sb.append(")");
    }

    private static boolean valid(int r, int c, int n) {
        char target = board[r][c];
        for (int i = r; i < r + n; i++) {
            for (int j = c; j < c + n; j++) {
                if (target != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
