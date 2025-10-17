package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_5533 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] game = new int[n][3];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            game[i][0] = Integer.parseInt(s[0]);
            game[i][1] = Integer.parseInt(s[1]);
            game[i][2] = Integer.parseInt(s[2]);
        }
        for (int i = 0; i < 3; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                map.put(game[j][i], map.getOrDefault(game[j][i], 0) + 1);
            }

            for (int j = 0; j < n; j++) {
                if (map.get(game[j][i]) == 1) {
                    scores[j] += game[j][i];
                }
            }
        }
        for (int score : scores) {
            bw.write(score + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
