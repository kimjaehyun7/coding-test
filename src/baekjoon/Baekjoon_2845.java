package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length; i++) {
            bw.write((array[i] - a) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
