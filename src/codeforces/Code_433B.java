package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_433B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        long[] preSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + arr[i - 1];
        }

        Arrays.sort(arr);
        long[] sortedSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sortedSum[i] = sortedSum[i - 1] + arr[i - 1];
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int type = Integer.parseInt(s[0]);
            int l = Integer.parseInt(s[1]);
            int r = Integer.parseInt(s[2]);

            long result;
            if (type == 1) {
                result = preSum[r] - preSum[l - 1];
            } else {
                result = sortedSum[r] - sortedSum[l - 1];
            }

            bw.write(result + "\n");
        }
        bw.flush();
    }
}
