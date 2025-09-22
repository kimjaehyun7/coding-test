package baekjoon;

import java.io.*;

public class Baekjoon_12833 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        for (int i = 0; i < c; i++) {
            a ^= b;
        }

        bw.write(a + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
