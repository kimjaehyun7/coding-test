package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_7562 {

    static int L;
    static boolean[][] visited;
    static int[][] count;
    static int[] moveX = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};
    static int R;
    static int C;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            L = Integer.parseInt(br.readLine()); // 체스판 한변의 길이

            visited = new boolean[L][L];
            count = new int[L][L];

            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]); // 나이트 위치
            int y = Integer.parseInt(s[1]); // 나이트 위치

            String[] sp = br.readLine().split(" ");
            R = Integer.parseInt(sp[0]); // 이동하려는 위치
            C = Integer.parseInt(sp[1]); // 이동하려는 위치

            bfs(x, y);
            bw.write(count[R][C] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y) {
        Deque<int[]> deque = new LinkedList<>();

        deque.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();

            int r = cur[0];
            int c = cur[1];

            if (R == r && C == c) {
                break;
            }

            for (int i = 0; i < 8; i++) {
                int nr = r + moveX[i];
                int nc = c + moveY[i];

                if (nr >= 0 && nr < L && nc >= 0 && nc < L
                        && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    deque.offer(new int[]{nr, nc});
                    count[nr][nc] = count[r][c] + 1;
                }
            }
        }
    }
}
