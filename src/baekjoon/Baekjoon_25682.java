package baekjoon;

import java.io.*;

public class Baekjoon_25682 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        // 입력값 채우기
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        // B로 시작하는 패턴 , W로 시작하는 패턴 만들기
        int[][] arrB = new int[N][M];
        int[][] arrW = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char startB = ((i + j) % 2 == 0) ? 'B' : 'W';
                char startW = ((i + j) % 2 == 0) ? 'W' : 'B';

                if (board[i][j] != startB) {
                    arrB[i][j]++;
                }
                if (board[i][j] != startW) {
                    arrW[i][j]++;
                }
            }
        }

        // prefix 배열 생성 N+1 x M+1
        int[][] preB = new int[N + 1][M + 1];
        int[][] preW = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                preB[i][j] = arrB[i - 1][j - 1] +
                        preB[i][j - 1] +
                        preB[i - 1][j] -
                        preB[i - 1][j - 1];
                preW[i][j] = arrW[i - 1][j - 1] +
                        preW[i][j - 1] +
                        preW[i - 1][j] -
                        preW[i - 1][j - 1];
            }
        }

        // 모든 K x K 구간 검사 후 최소값 찾기
        int min = Integer.MAX_VALUE;
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int bCount = preB[i][j] -
                        preB[i][j - K] -
                        preB[i - K][j] +
                        preB[i - K][j - K];
                int wCount = preW[i][j] -
                        preW[i][j - K] -
                        preW[i - K][j] +
                        preW[i - K][j - K];
                min = Math.min(min, Math.min(bCount, wCount));
            }
        }
        bw.write(min + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
