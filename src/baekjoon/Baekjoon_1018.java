package baekjoon;

import java.io.*;

public class Baekjoon_1018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int count = Integer.MAX_VALUE;
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                count = Math.min(count, getCount(arr, i, j));
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getCount(char[][] array, int x, int y) {
        int countB = 0;
        int countW = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char startB = (i + j) % 2 == 0 ? 'B' : 'W'; // B로 시작하는 패턴
                char startW = (i + j) % 2 == 0 ? 'W' : 'B'; // W로 시작하는 패턴

                if (array[x + i][y + j] != startB) { // BWBW 패턴 기준에서 다르면 B 패턴 카운트 1 증가
                    countB++;
                }
                if (array[x + i][y + j] != startW) { // WBWB 패턴 기준에서 다르면 B 패턴 카운트 1 증가
                    countW++;
                }
            }
        }
        return Math.min(countB, countW); // 비교 후 카운트 수가 작은 변수 반환
    }
}
