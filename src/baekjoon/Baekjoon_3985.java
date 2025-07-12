package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_3985 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine()); // 케이크의 길이
        int[] cake = new int[l + 1];

        int max = 0; // 가장 높은 케이크 기댓값
        int a = 0; // max 값에 해당하는 방청객

        int n = Integer.parseInt(br.readLine()); // 방청객 수

        Map<Integer, Integer> map = new HashMap<>(); // 방청객, 조각 수

        for (int i = 1; i <= n; i++) {

            String[] arr = br.readLine().split(" ");
            int p = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);

            if (k - p > max) {
                max = k - p;
                a = i;
            }

            for (int j = p; j <= k; j++) {
                if (cake[j] == 0) {
                    cake[j] = i;
                }
            }
        }

        for (int i = 1; i < cake.length; i++) {
            if (cake[i] == 0) continue;

            map.put(cake[i], map.getOrDefault(cake[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        int maxCount = 0; // 가장 많은 케이크 조각
        int number = 0; // 방청객 번호

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxCount) {
                number = i + 1;
                maxCount = list.get(i);
            }
        }

        bw.write(a + "\n" + number);
        bw.flush();
        bw.close();
        br.close();

    }
}
