package baekjoon;

import java.io.*;

public class Baekjoon_8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int score = 0;
            int count = 0;
            for (char c : br.readLine().toCharArray()) {
                if (c == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }
            bw.write(score+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
