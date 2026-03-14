package baekjoon;

import java.io.*;

public class Baekjoon_33515 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int t1 = Integer.parseInt(s[0]);
        int t2 = Integer.parseInt(s[1]);

        bw.write(Math.min(t1, t2) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
