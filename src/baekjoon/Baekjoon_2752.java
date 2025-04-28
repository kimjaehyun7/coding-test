package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2752 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        for (int i : arr) {
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
