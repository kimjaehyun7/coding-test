package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_1873E {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]); // 산호 기둥의 개수
            int x = Integer.parseInt(s[1]); // 사용할 수 있는 물의 최대 양

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            long left = 0;
            long right = arr[n - 1] + x;

            long result = 0;

            while (left <= right) {
                long mid = (left + right) / 2;

                long sum = 0;

                for (int j = 0; j < n; j++) {
                    if (mid > arr[j]) {
                        sum += (mid - arr[j]);
                    }
                }

                if (x >= sum) {
                    result = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
