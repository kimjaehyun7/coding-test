package baekjoon;

import java.io.*;

public class Baekjoon_3023 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int R = Integer.parseInt(s[0]);
        int C = Integer.parseInt(s[1]);

        char[][] card = new char[R * 2][C * 2];

        for (int i = 0; i < R; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                card[i][j] = arr[j];
                card[i][C * 2 - 1 - j] = arr[j];
            }
        }

        for (int i = 0; i < R; i++) {
            card[R + i] = card[R - 1 - i];
        }

        String[] sp = br.readLine().split(" ");
        int A = Integer.parseInt(sp[0]);
        int B = Integer.parseInt(sp[1]);

        for (int i = 0; i < R * 2; i++) {
            for (int j = 0; j < C * 2; j++) {
                if (i == A - 1 && j == B - 1) {
                    if (card[i][j] == '#') {
                        bw.write(".");
                    } else {
                        bw.write("#");
                    }
                } else {
                    bw.write(card[i][j] + "");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
