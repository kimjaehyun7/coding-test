package baekjoon;

import java.io.*;

public class Baekjoon_1524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            br.readLine();
            String[] player = br.readLine().split(" ");
            int sj = Integer.parseInt(player[0]);
            int sb = Integer.parseInt(player[1]);
            int maxSj = 0;
            int maxSb = 0;

            for (String s : br.readLine().split(" ")) {
                int sol = Integer.parseInt(s);
                if (maxSj < sol) {
                    maxSj = sol;
                }
            }
            for (String s : br.readLine().split(" ")) {
                int sol = Integer.parseInt(s);
                if (maxSb < sol) {
                    maxSb = sol;
                }
            }

            if (maxSb > maxSj) {
                bw.write("B\n");
            } else {
                bw.write("S\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
