package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int[] array = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(array);

        long sum = 0; // 거리의 합
        long subtract = 0; // 배열 요소 누적 합

        for (int i = 0; i < n; i++) {
            sum += (long) i * array[i] - subtract;
            subtract += array[i];
        }

        bw.write(sum * 2 + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
