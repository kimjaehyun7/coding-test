package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2805 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]); // 나무의 수
        int M = Integer.parseInt(s[1]); // 나무의 길이
        int[] h = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int left = 1;
        int right = Arrays.stream(h).max().getAsInt();

        int maxHeight = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long height = 0;
            for (int i : h) {
                if (i > mid) {
                    height += (i - mid);
                }
            }
            if (height < M) {
                right = mid - 1;
            } else if (height >= M) {
                left = mid + 1;
                maxHeight = Math.max(maxHeight, mid);
            }
        }

        bw.write(maxHeight + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
