package baekjoon;

import java.io.*;

public class Baekjoon_23825 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int min = Math.min(n, m);

        bw.write(min / 2 + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
