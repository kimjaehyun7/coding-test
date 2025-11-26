package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_10830 {

    static int N;
    static int[][] array;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        long B = Long.parseLong(s[1]);

        array = new int[N][N];
        for (int i = 0; i < N; i++) {
            array[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] result = pow(array, B);

        for (int[] ints : result) {
            for (int anInt : ints) {
                bw.write(anInt + " ");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
        br.close();

    }

    private static int[][] pow(int[][] arr, long B) {
        // B가 1일때도 바로 arr을 반환하면 안되고 나머지 연산을 해준뒤 반환해야함.
        if (B == 1){
            int[][] t = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    t[i][j] = arr[i][j] % 1000;
                }
            }
            return t;
        }

        int[][] temp = pow(arr, B / 2);

        if (B % 2 == 0) {
            return mul(temp, temp);
        } else {
            return mul(mul(temp, temp), array);
        }
    }

    private static int[][] mul(int[][] A, int[][] B) {
        int[][] AB = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int result = 0;
                for (int k = 0; k < N; k++) {
                    result += (A[i][k] * B[k][j]) % 1000;
                }
                AB[i][j] = result % 1000;
            }
        }
        return AB;
    }
}
