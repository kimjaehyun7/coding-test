package baekjoon;

import java.io.*;

public class Baekjoon_4435 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            int g = (Integer.parseInt(s[0]) +
                    (Integer.parseInt(s[1]) * 2) +
                    (Integer.parseInt(s[2]) * 3) +
                    (Integer.parseInt(s[3]) * 3) +
                    (Integer.parseInt(s[4]) * 4) +
                    (Integer.parseInt(s[5]) * 10)
            );

            String[] sp = br.readLine().split(" ");
            int sa = (Integer.parseInt(sp[0]) +
                    (Integer.parseInt(sp[1]) * 2) +
                    (Integer.parseInt(sp[2]) * 2) +
                    (Integer.parseInt(sp[3]) * 2) +
                    (Integer.parseInt(sp[4]) * 3) +
                    (Integer.parseInt(sp[5]) * 5) +
                    (Integer.parseInt(sp[6]) * 10)
            );

            if (g > sa) {
                bw.write("Battle " + i + ": Good triumphs over Evil\n");
            } else if (g < sa) {
                bw.write("Battle " + i + ": Evil eradicates all trace of Good\n");
            } else {
                bw.write("Battle " + i + ": No victor on this battle field\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
