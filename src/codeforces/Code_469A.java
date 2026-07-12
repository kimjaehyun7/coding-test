package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_469A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] game = new boolean[n + 1];
        game[0] = true;

        int[] arr1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 1; i < arr1.length; i++) {
            if (!game[arr1[i]]) {
                game[arr1[i]] = true;
            }
        }

        int[] arr2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 1; i < arr2.length; i++) {
            if (!game[arr2[i]]) {
                game[arr2[i]] = true;
            }
        }

        boolean clear = true;
        for (boolean b : game) {
            if (!b) {
                clear = false;
                break;
            }
        }

        if (clear) {
            bw.write("I become the guy.");
        } else {
            bw.write("Oh, my keyboard!");
        }
        bw.flush();
    }
}
