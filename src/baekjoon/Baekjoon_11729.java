package baekjoon;

import java.io.*;

public class Baekjoon_11729 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = (int) (Math.pow(2, n) - 1);

        hanoi(n, 1, 2,3);

        bw.write(count + "\n" + sb);
        bw.flush();
        bw.close();
        br.close();

    }
    /**
     * from -> 시작 기둥
     * to   -> 도착 기둥
     * via  -> 보조 기둥
     */
    private static void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }
        hanoi(n - 1, from, to, via);
        sb.append(from + " " + to + "\n");
        hanoi(n - 1, via, from, to);
    }
}
