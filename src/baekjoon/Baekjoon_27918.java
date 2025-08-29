package baekjoon;

import java.io.*;

public class Baekjoon_27918 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = 0;
        int Y = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String win = br.readLine();
            if (win.equals("D")) {
                X++;
            } else {
                Y++;
            }
            if (Math.abs(X - Y) == 2) {
                break;
            }
        }
        bw.write(X + ":" + Y);
        bw.flush();
        bw.close();
        br.close();
    }
}
