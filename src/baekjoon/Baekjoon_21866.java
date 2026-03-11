package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_21866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] score = {100, 100, 200, 200, 300, 300, 400, 400, 500};

        boolean hacker = false;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > score[i]) {
                hacker = true;
                break;
            }
        }

        if (hacker) {
            bw.write("hacker");
        } else {
            if (sum >= 100) {
                bw.write("draw");
            } else {
                bw.write("none");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
