package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_7569 {

    static int M;
    static int N;
    static int H;
    static int[][][] tomato;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        H = Integer.parseInt(s[2]);

        tomato = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                tomato[i][j] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
        }

        bfs();

        int result = 0;

        outer:
        for (int[][] ints : tomato) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    if (i == 0) {
                        result = -1;
                        break outer;
                    }
                    result = Math.max(result, i);
                }
            }
        }
        if (result != -1) {
            result -= 1;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs() {
        Deque<int[]> deque = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomato[i][j][k] == 1) {
                        deque.offer(new int[]{i, j, k});
                    }
                }
            }
        }

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int cz = cur[0];
            int cx = cur[1];
            int cy = cur[2];

            for (int i = 0; i < 6; i++) {
                int nz = cz + dz[i];
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nz >= 0 && nz < H && nx >= 0 && nx < N && ny >= 0 && ny < M
                        && tomato[nz][nx][ny] == 0) {
                    tomato[nz][nx][ny] = tomato[cz][cx][cy] + 1;
                    deque.offer(new int[]{nz, nx, ny});
                }
            }
        }
    }
}
