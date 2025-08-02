package baekjoon;

import java.io.*;

public class Baekjoon_15650 {

    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sp = br.readLine().split(" ");
        N = Integer.parseInt(sp[0]);
        M = Integer.parseInt(sp[1]);
        visited = new boolean[N + 1];
        arr = new int[M];

        dfs(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void dfs(int depth) {
        if (depth == M) {
            StringBuilder temp = new StringBuilder();
            int current = 0;
            for (int i : arr) {
                if (current >= i) {
                    return;
                }
                current = i;
                temp.append(i + " ");
            }
            temp.append("\n");
            sb.append(temp);
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }

    }
}
