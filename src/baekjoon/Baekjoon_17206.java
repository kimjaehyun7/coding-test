package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_17206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[] preSum = new int[80001];

        for (int i = 1; i < preSum.length; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                preSum[i] = preSum[i - 1] + i;
            } else {
                preSum[i] = preSum[i - 1];
            }
        }

        for (int i : Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()) {
            bw.write(preSum[i] + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
