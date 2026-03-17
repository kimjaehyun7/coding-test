package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Baekjoon_2178 {

    static int N;
    static int M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        bfs();

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs() {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int n = cur[0];
            int m = cur[1];

            if (n == N - 1 && m == M - 1) {
                result = map[n][m];
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = n + dx[i];
                int ny = m + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M
                        && map[nx][ny] == 1) {
                    map[nx][ny] = map[n][m] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
