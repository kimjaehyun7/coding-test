package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_339B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        long time = 0; // 시간
        int cur = 1; // 현재 위치 (1 ~ n)

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : arr) {
            if (cur <= i) {
                time += i - cur;
            } else {
                time += n - cur + i;
            }
            cur = i;
        }

        bw.write(time + "");
        bw.flush();
    }
}
