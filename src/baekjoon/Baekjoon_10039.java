package baekjoon;

import java.io.*;

public class Baekjoon_10039 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num < 40) {
                num = 40;
            }
            sum += num;
        }
        bw.write((sum / 5) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
