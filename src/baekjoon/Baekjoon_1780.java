package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1780 {

    static int N;
    static int[][] paper;
    static int minusOne;
    static int zero;
    static int one;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            paper[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        cut(0, 0, N);

        bw.write(minusOne + "\n");
        bw.write(zero + "\n");
        bw.write(one + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static void cut(int r, int c, int n) {
        int v = valid(r, c, n);
        if (v == -1) {
            minusOne++;
            return;
        } else if (v == 0) {
            zero++;
            return;
        } else if (v == 1) {
            one++;
            return;
        }

        n /= 3;

        cut(r, c, n);
        cut(r, c + n, n);
        cut(r, c + 2 * n, n);

        cut(r + n, c, n);
        cut(r + n, c + n, n);
        cut(r + n, c + 2 * n, n);

        cut(r + 2 * n, c, n);
        cut(r + 2 * n, c + n, n);
        cut(r + 2 * n, c + 2 * n, n);

    }

    private static int valid(int r, int c, int n) {
        int num = paper[r][c];
        for (int i = r; i < n + r; i++) {
            for (int j = c; j < n + c; j++) {
                if (paper[i][j] != num) {
                    return 2;
                }
            }
        }
        return num;
    }
}
