package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_7576 {

    static int result = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int M;
    static int N;
    static int[][] tomato;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);

        tomato = new int[N][M];

        for (int i = 0; i < N; i++) {
            tomato[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        bfs();

        for (int[] t : tomato) {
            for (int i : t) {
                if (i == 0) {
                    result = -1;
                }
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs() {
        Deque<int[]> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 1) {
                    deque.offer(new int[]{i, j, 0});
                }
            }
        }

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int cx = cur[0];
            int cy = cur[1];
            result = Math.max(result, cur[2]);

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && tomato[nx][ny] == 0) {
                    tomato[nx][ny] = 1;
                    deque.offer(new int[]{nx, ny, cur[2] + 1});
                }
            }
        }
    }

}
