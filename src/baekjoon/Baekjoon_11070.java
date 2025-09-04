package baekjoon;

import java.io.*;

public class Baekjoon_11070 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]); // 팀 개수
            int m = Integer.parseInt(s[1]); // 전체 경기 수
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int[][] team = new int[n + 1][2]; // [팀][득,실]

            for (int j = 0; j < m; j++) {
                String[] sp = br.readLine().split(" ");
                int a = Integer.parseInt(sp[0]);
                int b = Integer.parseInt(sp[1]);
                int p = Integer.parseInt(sp[2]); // a팀 득점 ( b팀 실점 )
                int q = Integer.parseInt(sp[3]); // b팀 득점 ( a팀 실점 )

                team[a][0] += p;
                team[a][1] += q;

                team[b][0] += q;
                team[b][1] += p;
            }

            for (int j = 1; j <= n; j++) {
                double W;
                int S = team[j][0];
                int A = team[j][1];
                if (S == 0 && A == 0) {
                    W = 0;
                } else {
                    W = Math.pow(S, 2) / (Math.pow(S, 2) + Math.pow(A, 2)) * 1000;
                }
                max = Math.max(max, (int) W);
                min = Math.min(min, (int) W);
            }
            bw.write(max+"\n");
            bw.write(min+"\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
