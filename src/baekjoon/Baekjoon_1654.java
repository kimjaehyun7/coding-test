package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int K = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long left = 1;
        long right = Arrays.stream(arr).max().getAsInt();
        long max = 0;

        while (left <= right) {
            long count = 0;
            long lan = (left + right) / 2;

            for (int i : arr) {
                count += i / lan;
            }

            if (count < N) {
                right = lan - 1;
            } else {
                left = lan + 1;
                max = Math.max(max, lan);
            }
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
