package baekjoon;

import java.io.*;

public class Baekjoon_5522 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 0;

        for (int i = 0; i < 5; i++) {
            score += Integer.parseInt(br.readLine());
        }

        bw.write(score+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
