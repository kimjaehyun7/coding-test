package baekjoon;

import java.io.*;

public class Baekjoon_2460 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int current = 0;

        for (int i = 0; i < 10; i++) {
            String[] split = br.readLine().split(" ");
            int off = Integer.parseInt(split[0]);
            int on = Integer.parseInt(split[1]);

            current -= off;
            current += on;

            if (max < current) {
                max = current;
            }
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
