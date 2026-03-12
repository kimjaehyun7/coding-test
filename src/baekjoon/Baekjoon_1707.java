package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Baekjoon_1707 {

    static int V;
    static int E;
    static List<Integer>[] graph;
    static int[] color; // 방문여부 대신 사용, 0은 미방문, 1과 -1로 구분
    static boolean isGraph;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            V = Integer.parseInt(s[0]); // 정점의 개수
            E = Integer.parseInt(s[1]); // 간선의 개수

            graph = new ArrayList[V + 1];
            for (int j = 1; j <= V; j++) {
                graph[j] = new ArrayList<>();
            }
            color = new int[V + 1];
            isGraph = true;

            for (int j = 0; j < E; j++) {
                String[] sp = br.readLine().split(" ");
                int u = Integer.parseInt(sp[0]);
                int v = Integer.parseInt(sp[1]);

                graph[u].add(v);
                graph[v].add(u);
            }

            for (int j = 1; j <= V; j++) {
                if (color[j] == 0) {
                    color[j] = 1;
                    bfs(j);
                }
            }

            if (isGraph) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            Integer cur = queue.poll();

            for (Integer next : graph[cur]) {
                if (color[next] == 0) {
                    color[next] = -color[cur]; // 1이면 -1을 대입, -1이면 1을 대입하도록 함
                    queue.offer(next);
                }
                // 현재 정점, 다음 정점이 같으면 이분그래프 x
                if (color[next] == color[cur]) {
                    isGraph = false;
                    return;
                }
            }
        }
    }
}
