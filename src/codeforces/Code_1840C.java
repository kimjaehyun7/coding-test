package codeforces;

import java.io.*;
import java.util.*;

public class Code_1840C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]); // 예보 길이
            int k = Integer.parseInt(s[1]); // 최소 휴가 일수
            int q = Integer.parseInt(s[2]); // 허용 가능한 최고 기온

            long result = 0;

            List<Integer> list = new ArrayList<>();

            int count = 0;

            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray(); // 각 날짜의 기온

            for (int num : arr) {
                if (num <= q) {
                    count++;
                } else {
                    list.add(count);
                    count = 0;
                }
            }
            list.add(count);

            for (Integer integer : list) {
                int l = integer - k + 1;
                for (int j = 1; j <= l; j++) {
                    result += j;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
