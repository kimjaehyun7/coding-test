package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_28097 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;

        for (int i = 0; i < N; i++) {
            result += arr[i];
            if (i != (N - 1)) {
                result += 8;
            }
        }

        bw.write(result / 24 + " " + result % 24);
        bw.flush();
        bw.close();
        br.close();
    }
}
