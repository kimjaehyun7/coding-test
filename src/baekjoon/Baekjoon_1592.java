package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1592 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int l = Integer.parseInt(split[2]);
        int count = 0;
        int receive = 0;
        int[] players = new int[n];
        players[0] = 1;

        if (m != 1) { // m이 1일때는 처음 공을 받자마자 끝나므로 공을 던질 필요가 없음
            while (true) {
                if (players[receive] % 2 != 0) { // 받은 횟수가 홀수번
                    receive += l;
                    if (receive > n - 1) {
                        receive -= n;
                    }
                    players[receive]++;
                } else { // 받은 횟수가 짝수번
                    receive -= l;
                    if (receive < 0) {
                        receive += n;
                    }
                    players[receive]++;
                }
                count++;
                int max = Arrays.stream(players).max().getAsInt();
                if (max == m) {
                    break;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
