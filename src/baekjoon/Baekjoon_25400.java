package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_25400 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int cnt = 0;
        int cur = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cur) {
                cur++;
            } else {
                cnt++;
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
