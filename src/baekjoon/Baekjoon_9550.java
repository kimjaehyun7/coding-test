package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_9550 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int result = 0;
            for (int j : arr) {
                result += j / k;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
