package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Baekjoon_1260 {

    static List<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int r = Integer.parseInt(s[2]); // 시작 정점

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] sp = br.readLine().split(" ");
            int u = Integer.parseInt(sp[0]);
            int v = Integer.parseInt(sp[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            graph[i].sort(null);
        }

        dfs(r);

        // 방문 여부 초기화
        for (int i = 1; i <= n; i++) {
            visited[i] = false;
        }
        // sb 줄바꿈
        sb.append("\n");

        bfs(r);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    // dfs - 재귀
    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        for (Integer next : graph[start]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // 큐 offer poll
    public static void bfs(int start) {
        Deque<Integer> deque = new LinkedList<>();

        deque.offer(start);
        visited[start] = true;
        sb.append(start).append(" ");

        while (!deque.isEmpty()) {
            Integer node = deque.poll();

            for (Integer next : graph[node]) {
                if (!visited[next]) {
                    deque.offer(next);
                    visited[next] = true;
                    sb.append(next).append(" ");
                }
            }
        }
    }
}
