package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_28214 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 묶음
        int k = Integer.parseInt(s[1]); // k개당 1묶음
        int p = Integer.parseInt(s[2]); // 크림 없는 빵 p개 이상이면 못팔음
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bread = 0;

        int index = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                if (arr[index++] == 0) {
                    count++;
                }
            }
            if (count >= p) {
                continue;
            }
            bread++;
        }

        bw.write(bread + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
