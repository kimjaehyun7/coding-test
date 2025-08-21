package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_28014 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 1;
        int current = arr[0];

        for (int i = 1; i < n; i++) {
            if (current <= arr[i]) {
                count++;
            }
            current = arr[i];
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
