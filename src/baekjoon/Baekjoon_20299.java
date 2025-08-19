package baekjoon;

import java.io.*;

public class Baekjoon_20299 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]); // 팀의 수
        int K = Integer.parseInt(s[1]); // 합 조건
        int L = Integer.parseInt(s[2]); // 개인 조건
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] team = br.readLine().split(" ");
            int a = Integer.parseInt(team[0]);
            int b = Integer.parseInt(team[1]);
            int c = Integer.parseInt(team[2]);

            if ((a + b + c) >= K && a >= L && b >= L && c >= L) {
                count++;
                sb.append(a + " " + b + " " + c + " ");
            }
        }
        bw.write(count + "\n" + sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
