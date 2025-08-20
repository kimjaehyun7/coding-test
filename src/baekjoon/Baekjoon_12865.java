package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baekjoon_12865 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 물품의 수
        int k = Integer.parseInt(s[1]); // 버틸 수 있는 무게
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray());
        }

        int[][] dp = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            int[] arr = list.get(i - 1);
            int weight = arr[0];
            int value = arr[1];

            for (int j = 1; j <= k; j++) {
                if (weight > j) { // 무게 초과
                    dp[i][j] = dp[i - 1][j];
                } else { // 담을 수 있음
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
                }
            }
        }

        bw.write(dp[n][k]+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
