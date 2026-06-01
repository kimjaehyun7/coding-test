package codeforces;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Code_520B {

    static boolean[] visited = new boolean[10001];
    static int m;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        bfs(n);

        bw.write(result + "");
        bw.flush();
    }

    static void bfs(int start) {
        Queue<int[]> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.offer(new int[]{start, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int dist = cur[0];
            int count = cur[1];

            if (dist == m) {
                result = count;
                return;
            }

            int red = dist * 2;
            int blue = dist - 1;

            if (red <= 10000 && !visited[red]) {
                visited[red] = true;
                queue.offer(new int[]{red, count + 1});
            }
            if (blue >= 1 && !visited[blue]) {
                visited[blue] = true;
                queue.offer(new int[]{blue, count + 1});
            }
        }
    }
}
