package codeforces;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_580C {

    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] cats;
    static int m;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 정점의 개수
        m = Integer.parseInt(s[1]); // 고양이가 있는 정점이 m개를 초과하면 식당에 안감

        cats = new int[n + 1];
        visited = new boolean[n + 1];
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 1; i <= n; i++) {
            cats[i] = arr[i - 1];
        }

        for (int i = 0; i < n - 1; i++) {
            String[] sp = br.readLine().split(" ");
            int u = Integer.parseInt(sp[0]);
            int v = Integer.parseInt(sp[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        visited[1] = true;
        dfs(1, 0);

        bw.write(result + "");
        bw.flush();
    }

    static void dfs(int start, int count) {
        if (cats[start] == 0) {
            count = 0;
        } else {
            count++;
        }
        if (count > m) {
            return;
        }

        boolean isLeaf = true;
        for (Integer next : graph[start]) {
            if (!visited[next]) {
                isLeaf = false;
                visited[next] = true;
                dfs(next, count);
            }
        }
        if (isLeaf) {
            result++;
        }
    }
}
