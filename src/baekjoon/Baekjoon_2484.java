package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2484 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int[] dice = new int[7];
            int price = 0;
            for (String s : br.readLine().split(" ")) {
                dice[Integer.parseInt(s)]++;
            }
            int maxDice = Arrays.stream(dice).max().getAsInt();

            if (maxDice == 4) {
                for (int j = 1; j < dice.length; j++) {
                    if (dice[j] == maxDice) {
                        price = 50000 + j * 5000;
                    }
                }
            } else if (maxDice == 3) {
                for (int j = 1; j < dice.length; j++) {
                    if (dice[j] == maxDice) {
                        price = 10000 + j * 1000;
                    }
                }
            } else if (maxDice == 2) {
                int count = 0;
                for (int die : dice) {
                    if (maxDice == die) {
                        count++;
                    }
                }

                if (count == 1) {
                    for (int j = 1; j < dice.length; j++) {
                        if (dice[j] == maxDice) {
                            price = 1000 + j * 100;
                        }
                    }
                } else {
                    for (int j = 1; j < dice.length; j++) {
                        if (dice[j] == maxDice) {
                            price += (1000 + j * 500);
                        }
                    }
                }
            } else if (maxDice == 1) {
                for (int j = dice.length - 1; j >= 1; j--) {
                    if (dice[j] == maxDice) {
                        price = j * 100;
                        break;
                    }
                }
            }
            answer = Math.max(answer, price);
        }
        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
