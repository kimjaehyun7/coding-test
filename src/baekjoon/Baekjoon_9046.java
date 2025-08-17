package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_9046 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int[] alpha = new int[26];
            char[] array = br.readLine().toCharArray();
            int count = 0;
            int index = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == ' ') {
                    continue;
                }
                alpha[array[j] - 'a']++;
            }
            int max = Arrays.stream(alpha).max().getAsInt();
            for (int j = 0; j < alpha.length; j++) {
                if (alpha[j] == max) {
                    count++;
                    index = j;
                }
            }
            if (count >= 2) {
                bw.write("?\n");
            } else {
                bw.write((char) (index + 'a') + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
