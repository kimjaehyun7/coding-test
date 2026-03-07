package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_28281 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]); // 남은 일수
        int X = Integer.parseInt(s[1]); // 양말 개수
        int min = Integer.MAX_VALUE; // 최소 연속 2일

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i - 1] + arr[i]);
        }

        bw.write((min * X) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
