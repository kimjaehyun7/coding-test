package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_10986 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        long[] remain = new long[m];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            sum = (sum + num) % m;
            remain[(int) sum]++;
        }
        long result = remain[0]; // 나머지가 0인 구간
        for (int i = 0; i < remain.length; i++) {
            if (remain[i] > 1) {
                // 조합 공식
                result += (remain[i] * (remain[i] - 1)) / 2;
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
