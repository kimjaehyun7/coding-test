package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_492B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 가로등 수
        int l = Integer.parseInt(s[1]); // 거리 길이

        int[] lanterns = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(lanterns);

        double max = Double.MIN_VALUE;
        int left = lanterns[0];
        for (int i = 1; i < lanterns.length; i++) {
            max = Math.max(max, (double) (lanterns[i] - left) / 2);
            left = lanterns[i];
        }
        if (lanterns[0] != 0) {
            max = Math.max(max, lanterns[0]);
        }
        if (lanterns[n - 1] != l) {
            max = Math.max(max, l - lanterns[n - 1]);
        }

        String result = String.format("%.10f", max);
        bw.write(result);
        bw.flush();
    }
}
