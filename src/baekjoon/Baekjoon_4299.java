package baekjoon;

import java.io.*;

public class Baekjoon_4299 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);

        if (game(num1, num2)) {
            int team1 = (num1 + num2) / 2;
            int team2 = Math.abs(num1 - num2) / 2;

            if (team1 >= team2) {
                bw.write(team1 + " " + team2);
            } else {
                bw.write(team2 + " " + team1);
            }
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean game(int a, int b) {
        if (b > a) {
            return false;
        }
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                return true;
            }
        } else if (a % 2 == 1) {
            if (b % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
