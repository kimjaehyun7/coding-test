package baekjoon;

import java.io.*;

public class Baekjoon_31962 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);

        int time = -1;
        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split(" ");
            int S = Integer.parseInt(sp[0]);
            int T = Integer.parseInt(sp[1]);

            if (S + T <= x) {
                time = Math.max(time, S);
            }

        }
        bw.write(time + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
