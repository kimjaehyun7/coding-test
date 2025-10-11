package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int cur = 0;
        int sum = 0;
        for (int i : arr) {
            cur += i;
            sum += cur;
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
