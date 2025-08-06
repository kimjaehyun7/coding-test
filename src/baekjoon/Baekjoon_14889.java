package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_14889 {

    static int N;
    static int[][] S;
    static boolean[] visited; // 방문 시 스타트 팀, 아니면 링크 팀 으로 분류
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            S[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        dfs(0, 0);

        bw.write(min + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int depth, int index) {
        if (depth == N / 2) {
            operation();
            return;
        }

        for (int i = index; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    private static void operation() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += S[i][j] + S[j][i];
                } else if (!visited[i] && !visited[j]) {
                    link += S[i][j] + S[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(start - link));
    }
}
