package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2447 {

    static char[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        map = new char[n][n];

        draw(0, 0, n);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());


        bw.flush();
        bw.close();
        br.close();
    }

    private static void draw(int y, int x, int size) {
        if (size == 1) {
            map[y][x] = '*';
            return;
        }

        int newSize = size / 3;

        for (int dy = 0; dy < 3; dy++) {
            for (int dx = 0; dx < 3; dx++) {
                if (dy == 1 && dx == 1) {
                    blank(y + newSize, x + newSize, newSize);
                } else {
                    draw(y + dy * newSize, x + dx * newSize, newSize);
                }
            }
        }

    }

    private static void blank(int y, int x, int size) {
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                map[i][j] = ' ';
            }
        }
    }
}
