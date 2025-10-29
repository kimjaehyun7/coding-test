package baekjoon;

import java.io.*;

public class Baekjoon_33612 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int year = 2024;
        int month = 8;

        for (int i = 1; i < n; i++) {
            month += 7;
            if (month > 12) {
                year++;
                month -= 12;
            }
        }
        bw.write(year + " " + month);
        bw.flush();
        bw.close();
        br.close();
    }
}
