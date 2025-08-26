package baekjoon;

import java.io.*;

public class Baekjoon_2966 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근: A,B,C 패턴
        // 창영: B,A,B,C 패턴
        // 현진: C,C,A,A,B,B 패턴

        int n = Integer.parseInt(br.readLine());

        String[] pattern = {"ABC", "BABC", "CCAABB"};
        int sIndex = 0;
        int cIndex = 0;
        int hIndex = 0;

        int sScore = 0;
        int cScore = 0;
        int hScore = 0;

        for (char c : br.readLine().toCharArray()) {
            if (c == pattern[0].charAt(sIndex++)) {
                sScore++;
            }
            if (c == pattern[1].charAt(cIndex++)) {
                cScore++;
            }
            if (c == pattern[2].charAt(hIndex++)) {
                hScore++;
            }
            if (sIndex == 3) {
                sIndex = 0;
            }
            if (cIndex == 4) {
                cIndex = 0;
            }
            if (hIndex == 6) {
                hIndex = 0;
            }
        }

        int max = Math.max(sScore, Math.max(cScore, hScore));

        bw.write(max + "\n");

        if (max == sScore) {
            bw.write("Adrian\n");
        }
        if (max == cScore) {
            bw.write("Bruno\n");
        }
        if (max == hScore) {
            bw.write("Goran");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
