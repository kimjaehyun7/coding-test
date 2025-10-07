package baekjoon;

import java.io.*;

public class Baekjoon_2991 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = Integer.parseInt(s[3]);

        for (String str : br.readLine().split(" ")) {
            int arrive = Integer.parseInt(str);
            int attack = 0;
            int i = arrive % (a + b);
            if (i <= a && i != 0) {

                attack++;
            }
            int j = arrive % (c + d);
            if (j <= c && j != 0) {
                attack++;
            }
            bw.write(attack + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
