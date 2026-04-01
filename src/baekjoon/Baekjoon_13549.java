package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Baekjoon_13549 {

    static int N;
    static int K;
    static int result;
    static int INF = Integer.MAX_VALUE;
    static int[] dist = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        K = Integer.parseInt(s[1]);

        dijkstra(N);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        Arrays.fill(dist, INF);
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.cost > dist[cur.to]) {
                continue;
            }

            int to = cur.to;
            int cost = cur.cost;

            if (to == K) {
                result = cost;
                return;
            }

            int front = to + 1;
            if (front <= 100000 && dist[front] > cost + 1) {
                dist[front] = cost + 1;
                pq.offer(new Node(front, dist[front]));
            }

            int back = to - 1;
            if (back >= 0 && dist[back] > cost + 1) {
                dist[back] = cost + 1;
                pq.offer(new Node(back, dist[back]));
            }

            int tel = to * 2;
            if (tel <= 100000 && dist[tel] > cost) {
                dist[tel] = cost;
                pq.offer(new Node(tel, dist[tel]));
            }
        }
    }

    static class Node {
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}
