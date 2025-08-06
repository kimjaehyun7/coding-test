package baekjoon;

import java.io.*;

public class Baekjoon_4493 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int player1Score = 0;

            for (int j = 0; j < n; j++) {
                String[] arr = br.readLine().split(" ");
                player1Score += game(arr[0], arr[1]);
            }
            if (player1Score == 0) {
                bw.write("TIE\n");
            } else if (player1Score > 0) {
                bw.write("Player 1\n");
            } else {
                bw.write("Player 2\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int game(String player1, String player2) {
        if (player1.equals(player2)) return 0;

        if (player1.equals("R")) {
            if (player2.equals("S")) {
                return 1;
            } else {
                return -1;
            }
        } else if (player1.equals("S")) {
            if (player2.equals("P")) {
                return 1;
            } else {
                return -1;
            }
        } else {
            if (player2.equals("R")) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
