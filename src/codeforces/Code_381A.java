package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_381A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sereja = 0;
        int dima = 0;

        int left = 0;
        int right = n - 1;

        boolean st = true;
        while (left <= right) {
            int game;

            if (arr[left] <= arr[right]) {
                game = arr[right--];
            } else {
                game = arr[left++];
            }

            if (st) {
                sereja += game;
            } else {
                dima += game;
            }
            st = !st;
        }

        bw.write(sereja + " " + dima);
        bw.flush();
    }
}
