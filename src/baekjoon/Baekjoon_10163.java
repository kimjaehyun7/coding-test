package baekjoon;

import java.io.*;

public class Baekjoon_10163 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[1001][1001];
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            int w = Integer.parseInt(arr[2]);
            int h = Integer.parseInt(arr[3]);
            for (int j = y; j < y + h; j++) {
                for (int k = x; k < x + w; k++) {
                    board[j][k] = i;
                }
            }
        }
        for (int[] ints : board) {
            for (int anInt : ints) {
                count[anInt]++;
            }
        }
        for (int i = 1; i < count.length; i++) {
            bw.write(count[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
