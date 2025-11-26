package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2740 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int an = Integer.parseInt(s[0]);
        int am = Integer.parseInt(s[1]);
        int[][] A = new int[an][am];
        for (int i = 0; i < an; i++) {
            A[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        String[] s1 = br.readLine().split(" ");
        int bm = Integer.parseInt(s1[0]);
        int bk = Integer.parseInt(s1[1]);
        int[][] B = new int[bm][bk];
        for (int i = 0; i < bm; i++) {
            B[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int[][] AB = new int[an][bk];
        for (int i = 0; i < an; i++) {
            for (int j = 0; j < bk; j++) {
                int result = 0;
                for (int k = 0; k < am; k++) {
                    result += A[i][k] * B[k][j];
                }
                AB[i][j] = result;
            }
        }
        for (int[] ints : AB) {
            for (int anInt : ints) {
                bw.write(anInt+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
