package programmers;

public class Pro_43162 {

    static int result = 0;
    static boolean[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;

        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, n);
                result++;
            }
        }

        return answer = result;
    }

    static void dfs(int x, int[][] computers, int n) {
        visited[x] = true;

        for (int i = 0; i < n; i++) {
            if (i == x) {
                continue;
            }

            if (computers[x][i] == 1 && !visited[i]) {
                dfs(i, computers, n);
            }
        }
    }
}

