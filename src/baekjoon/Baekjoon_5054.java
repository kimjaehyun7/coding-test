package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_5054 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Arrays.sort(arr);
            int result = (arr[arr.length - 1] - arr[0]) * 2;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
