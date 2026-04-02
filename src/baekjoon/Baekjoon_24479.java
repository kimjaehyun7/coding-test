package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_24479 {

    static int N;
    static int M;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] result;
    static int count = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        int R = Integer.parseInt(s[2]); // 시작 정점

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i < M; i++) {
            String[] sp = br.readLine().split(" ");
            int u = Integer.parseInt(sp[0]);
            int v = Integer.parseInt(sp[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            graph[i].sort(null);
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int node) {
        visited[node] = true;
        result[node] = count++;

        for (Integer next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
