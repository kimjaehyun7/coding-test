package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Baekjoon_1697 {

    static int N;
    static int K;
    static boolean[] visited = new boolean[100001];
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]); // 수빈이의 위치
        K = Integer.parseInt(s[1]); // 동생이 있는 위치

        bfs(N);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs(int start) {
        Queue<int[]> queue = new ArrayDeque<>();

        visited[start] = true;
        queue.offer(new int[]{start, 0});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int next = poll[0];
            int count = poll[1];

            if (next == K) {
                result = count;
                break;
            }

            int[] moves = {next - 1, next + 1, next * 2};

            for (int move : moves) {
                if (move >= 0 && move <= 100000 && !visited[move]) {
                    visited[move] = true;
                    queue.offer(new int[]{move, count + 1});
                }
            }
        }
    }
}
