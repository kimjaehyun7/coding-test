package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_706B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 도시 내에 있는 상점의 수
        int[] x = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); // 각 상점의 음료 가격을 나타내는 n개의 정수
        Arrays.sort(x);
        int q = Integer.parseInt(br.readLine()); // 바실리가 음료를 구매할 날의 수
        for (int i = 0; i < q; i++) {
            int m = Integer.parseInt(br.readLine()); // 바실리가 음료를 사기 위해 쓸 수 있는 동전의 수

            int count = 0;

            int left = 0;
            int right = x.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                int target = x[mid];

                if (target <= m) {
                    left = mid + 1;
                    count = Math.max(count, mid + 1);
                } else {
                    right = mid - 1;
                }

            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}
