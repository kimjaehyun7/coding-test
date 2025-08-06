package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2580 {

    static int[][] board = new int[9][9]; // 스도쿠 보드
    static List<int[]> blanks = new ArrayList<>(); // 빈 칸 리스트
    static boolean solved = false; // 스도쿠 완성 여부
    static StringBuilder sb = new StringBuilder(); // 완성 보드 입력 버퍼

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 9; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
                if (board[i][j] == 0) { // 빈 칸 저장
                    blanks.add(new int[]{i, j});
                }
            }
        }

        fill(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    // index 번째 빈 칸에 숫자를 채운다.
    private static void fill(int index) {
        if (solved) return; // 보드가 완성 되었으면 리턴

        if (index == blanks.size()) { // index 가 14이면 0 ~ 13 번째 인덱스가 다 채워진 것이다.
            solved = true;
            for (int[] row : board) {
                for (int num : row) {
                    sb.append(num + " ");
                }
                sb.append("\n");
            }
            return;
        }

        int[] pos = blanks.get(index); // 0이 들어있는 좌표
        int row = pos[0];
        int col = pos[1];

        for (int i = 1; i <= 9; i++) {
            if (isValid(row, col, i)) {
                board[row][col] = i;
                fill(index + 1);
                board[row][col] = 0; // 백트래킹
            }

        }
    }

    // row, col 좌표에 num 을 넣을 수 있는지 검사
    private static boolean isValid(int row, int col, int num) {
        // 가로 검사
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // 세로 검사
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // 3 x 3 박스 검사
        // 행 또는 열 값에 3을 나누고 3을 곱해주면 3x3 박스의 첫 행, 첫 열의 값이 나온다.
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        // 다 통과했으면 숫자를 넣을 수 있다.
        return true;
    }
}
