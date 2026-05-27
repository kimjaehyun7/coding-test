package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_363B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 판자의 개수
        int k = Integer.parseInt(s[1]); // 피아노를 들여놓기 위해 제거해야 하는 연속된 판자의 개수

        int[] preSum = new int[n + 1];

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + arr[i];
        }

        int idx = 0;
        int min = Integer.MAX_VALUE;

        for (int i = k; i <= n; i++) {
            if (min > preSum[i] - preSum[-k + i]) {
                min = preSum[i] - preSum[-k + i];
                idx = i - k + 1;
            }
        }

        bw.write(idx + "");
        bw.flush();
    }
}
