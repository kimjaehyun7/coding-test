package baekjoon;

import java.io.*;

public class Baekjoon_2511 {

    static int scoreA = 0;
    static int scoreB = 0;
    static String lastGameWinner;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String playerA = br.readLine();
        String playerB = br.readLine();

        if (playerA.equals(playerB)) {
            bw.write(10 + " " + 10 + "\nD");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        String[] deckA = playerA.split(" ");
        String[] deckB = playerB.split(" ");
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(deckA[i]);
            int b = Integer.parseInt(deckB[i]);
            if (a > b) {
                scoreA += 3;
                lastGameWinner = "A";
            } else if (b > a) {
                scoreB += 3;
                lastGameWinner = "B";
            } else {
                scoreA++;
                scoreB++;
            }
        }

        if (scoreA > scoreB) {
            bw.write(scoreA + " " + scoreB + "\nA");
        } else if (scoreB > scoreA) {
            bw.write(scoreA + " " + scoreB + "\nB");
        } else {
            bw.write(scoreA + " " + scoreB + "\n" + lastGameWinner);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
