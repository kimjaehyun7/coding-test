package baekjoon;

import java.io.*;

public class Baekjoon_2160 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char [][][] board = new char[n][5][7];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = br.readLine().toCharArray();
            }
        }
        int min = Integer.MAX_VALUE;
        String result = null;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = 0;
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 7; l++) {
                        if (board[i][k][l] != board[j][k][l]) {
                            diff++;
                        }
                    }
                }
                if (diff < min) {
                    min = diff;
                    result = (j + 1) + " " + (i + 1);
                }
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
