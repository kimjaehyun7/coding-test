package codeforces;

import java.io.*;
import java.util.*;

public class Code_20C {

    static int n;
    static int m;
    static List<Node>[] graph;
    static long INF = Long.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();
    static long[] dist;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        dist = new long[n + 1];
        parent = new int[n + 1];

        m = Integer.parseInt(s[1]);
        for (int i = 0; i < m; i++) {
            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            int w = Integer.parseInt(sp[2]);

            graph[a].add(new Node(b, w));
            graph[b].add(new Node(a, w));
        }

        dijkstra(1);

        if (dist[n] == INF) {
            bw.write("-1");
        } else {
            List<Integer> path = new ArrayList<>();

            for (int i = n; i != 0; i = parent[i]) {
                path.add(i);
            }

            Collections.reverse(path);

            for (Integer integer : path) {
                sb.append(integer).append(" ");
            }

            bw.write(sb.toString());
        }

        bw.flush();
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));
        Arrays.fill(dist, INF);
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int to = cur.to;
            long cost = cur.cost;

            if (cost > dist[to]) {
                continue;
            }

            for (Node next : graph[to]) {
                if (dist[next.to] > dist[to] + next.cost) {
                    dist[next.to] = dist[to] + next.cost;
                    parent[next.to] = to;
                    pq.offer(new Node(next.to, dist[next.to]));
                }
            }
        }
    }

    static class Node {
        int to;
        long cost;

        public Node(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }

}
