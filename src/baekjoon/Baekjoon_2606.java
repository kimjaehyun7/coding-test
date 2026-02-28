package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Baekjoon_2606 {

    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 컴퓨터의 수(정점)
        int m = Integer.parseInt(br.readLine()); // 연결되어있는 컴퓨터 수(간선)

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        // dfs
        dfs(1);

        int count = -1;
        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                count++;
            }
        }

        bw.write(count + "");


        bw.flush();
        bw.close();
        br.close();
    }
    // push, pop
    public static void dfs(int start) {
        Deque<Integer> deque = new LinkedList<>();

        deque.push(start);
        visited[start] = true;

        while (!deque.isEmpty()) {
            Integer node = deque.pop();

            for (Integer next : graph[node]) {
                if (!visited[next]) {
                    deque.push(next);
                    visited[next] = true;
                }
            }
        }
    }
}
