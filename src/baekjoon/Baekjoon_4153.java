package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] arr = new int[3];
            String[] split = br.readLine().split(" ");
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            Arrays.sort(arr);
            if (arr[2] == 0) {
                break;
            }
            bw.write(isTri(arr)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static String isTri(int[] arr) {
        int ab = (arr[0] * arr[0]) + (arr[1] * arr[1]);
        int c = arr[2] * arr[2];
        return (ab == c) ? "right" : "wrong";
    }
}
