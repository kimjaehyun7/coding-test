package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Baekjoon_2252 {

    static int N;
    static int M;
    static List<Integer>[] graph;
    static int[] inDegree;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        inDegree = new int[N + 1];

        for (int i = 0; i < M; i++) {
            String[] sp = br.readLine().split(" ");
            int A = Integer.parseInt(sp[0]);
            int B = Integer.parseInt(sp[1]);

            graph[A].add(B);
            inDegree[B]++;
        }

        bfs();

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer cur = queue.poll();

            sb.append(cur).append(" ");

            for (Integer next : graph[cur]) {
                inDegree[next]--;

                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
    }
}
