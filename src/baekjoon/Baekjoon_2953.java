package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2953 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int winner = 0;
        int score = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sum();
            if (sum > score) {
                score = sum;
                winner = i;
            }
        }

        bw.write(winner + " " + score);
        bw.flush();
        bw.close();
        br.close();

    }
}
