package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2851 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 0;
        int[] scores = new int[10];
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int mushroom = Integer.parseInt(br.readLine());
            score += mushroom;
            scores[i] = score;
            arr[i] = Math.abs(100 - score);
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                index = i;
                break;
            }
        }
        bw.write(scores[index]+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
