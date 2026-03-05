package baekjoon;

import java.io.*;

public class Baekjoon_1012 {

    static int M;
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            result = 0;
            String[] s = br.readLine().split(" ");
            M = Integer.parseInt(s[0]);
            N = Integer.parseInt(s[1]);
            int K = Integer.parseInt(s[2]);

            map = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                String[] sp = br.readLine().split(" ");
                int x = Integer.parseInt(sp[0]);
                int y = Integer.parseInt(sp[1]);

                map[x][y] = 1;
            }

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        result++;
                    }
                }
            }

            bw.write(result + "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int x, int y) {

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}
