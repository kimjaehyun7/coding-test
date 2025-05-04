package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2476 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");

            if (split[0].equals(split[1]) && split[1].equals(split[2])) {
                int prize = Integer.parseInt(split[0]) * 1000 + 10000;
                if (prize > maxPrize) {
                    maxPrize = prize;
                }
            } else if (split[0].equals(split[1]) || split[0].equals(split[2])) {
                int prize = Integer.parseInt(split[0]) * 100 + 1000;
                if (prize > maxPrize) {
                    maxPrize = prize;
                }
            } else if (split[1].equals(split[2])) {
                int prize = Integer.parseInt(split[1]) * 100 + 1000;
                if (prize > maxPrize) {
                    maxPrize = prize;
                }
            } else {
                int max = Arrays.stream(split).mapToInt(Integer::parseInt).max().getAsInt();
                int prize = max * 100;
                if (prize > maxPrize) {
                    maxPrize = prize;
                }
            }
        }
        bw.write(maxPrize+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
