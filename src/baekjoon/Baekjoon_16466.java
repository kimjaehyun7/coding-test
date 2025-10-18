package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_16466 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int result = 1;
        for (int i : arr) {
            if (result == i) {
                result++;
            } else {
                break;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
