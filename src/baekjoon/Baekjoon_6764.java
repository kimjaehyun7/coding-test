package baekjoon;

import java.io.*;

public class Baekjoon_6764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean rise = true;
        boolean dive = true;
        boolean same = true;
        int current = Integer.parseInt(br.readLine());;

        for (int i = 0; i < 3; i++) {
            int fish = Integer.parseInt(br.readLine());
            if (fish > current) {
                dive = false;
                same = false;
                current = fish;
            } else if (fish < current) {
                rise = false;
                same = false;
                current = fish;
            } else {
                rise = false;
                dive = false;
            }
        }

        if (rise) {
            bw.write("Fish Rising");
        } else if (dive) {
            bw.write("Fish Diving");
        } else if (same) {
            bw.write("Fish At Constant Depth");
        } else {
            bw.write("No Fish");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
