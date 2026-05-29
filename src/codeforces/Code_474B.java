package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_474B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 벌레 더미의 개수

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); // 각 더미의 벌레 수

        int[] worms = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            worms[i] = worms[i - 1] + arr[i - 1];
        }

        int m = Integer.parseInt(br.readLine()); // 맛있는 벌레의 수
        int[] arr2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); // 벌레 위치

        for (int i : arr2) {
            int left = 0;
            int right = n;

            int result = 0;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (worms[mid] >= i) {
                    right = mid - 1;
                    result = mid;
                } else {
                    left = mid + 1;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
