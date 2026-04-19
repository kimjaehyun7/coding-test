package programmers;

import java.util.ArrayDeque;
import java.util.Queue;

public class Pro_1844 {
    static int result = -1;
    static int n;
    static int m;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;

    public int solution(int[][] maps) {
        int answer = 0;

        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n + 1][m + 1];

        bfs(maps);

        answer = result;

        System.out.println("answer = " + answer);

        return answer;
    }

    static void bfs(int[][] maps) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1}); // x,y,dist

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            int dist = cur[2];

            if (n - 1 == cx && m - 1 == cy) {
                result = dist;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny, dist + 1});
                    }
                }
            }
        }
    }
}
