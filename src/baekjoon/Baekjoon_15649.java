package baekjoon;

import java.io.*;

public class Baekjoon_15649 {

    static int N, M;
    static boolean[] visited; // 사용 여부 체크
    static int[] arr; // 출력할 숫자 배열
    static StringBuilder sb = new StringBuilder(); // 정답 출력 버퍼

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);

        visited = new boolean[N + 1]; // 인덱스 0번은 사용 X
        arr = new int[M]; // M개를 선택 후 출력

        dfs(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void dfs(int depth) {
        // M개 다 고르면 출력
        if (depth == M) {
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        // 사용 여부 체크 후 배열에 숫자 넣고 다음 깊이로 dfs 호출
        // 출력 후 백트래킹 (복구)
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
