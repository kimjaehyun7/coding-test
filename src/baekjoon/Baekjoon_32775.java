package baekjoon;

import java.io.*;

public class Baekjoon_32775 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Sab = Integer.parseInt(br.readLine()); // 역a에서 역b로 고속철도
        int Fab = Integer.parseInt(br.readLine()); // 공항a에서 공항b로 항공

        if (Sab <= Fab) {
            bw.write("high speed rail");
        } else {
            bw.write("flight");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
