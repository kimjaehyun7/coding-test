package baekjoon;

import java.io.*;

public class Baekjoon_9663 {

    static int N;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int depth) { // depth -> 행
        if (depth == N) {
            count++;
            return;
        }

        // arr[0] = 0 -> 0,0 에 퀸을 둔다. 즉, 값이 같으면 같은 열.
        for (int i = 0; i < N; i++) { // i -> 열
            arr[depth] = i;
            if (isValid(depth)) {
                dfs(depth + 1);
            }
        }
    }

    private static boolean isValid(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[i] == arr[depth]) return false; // 같은 열
            if (Math.abs(depth-i) == Math.abs(arr[depth] - arr[i])) return false; // 같은 대각선, 행 차이와 열 차이가 같으면 같은 대각선이다.
        }
        return true;
    }
}
