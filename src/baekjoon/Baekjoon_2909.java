package baekjoon;

import java.io.*;

public class Baekjoon_2909 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        double c = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        StringBuilder m = new StringBuilder("1");
        for (int i = 0; i < k; i++) {
            m.append("0");
        }
        int n = Integer.parseInt(m.toString());

        bw.write(Math.round(c / n) * n + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
