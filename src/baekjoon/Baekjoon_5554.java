package baekjoon;

import java.io.*;

public class Baekjoon_5554 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = 0;
        int sec = 0;

        for (int i = 0; i < 4; i++) {
            int time = Integer.parseInt(br.readLine());
            min += time / 60;
            sec += time % 60;
        }

        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }

        bw.write(min + "\n" + sec);
        bw.flush();
        bw.close();
        br.close();
    }
}
