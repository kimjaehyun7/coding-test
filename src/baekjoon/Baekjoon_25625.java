package baekjoon;

import java.io.*;

public class Baekjoon_25625 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        if (y >= x) {
            bw.write((y - x) + "");
        } else {
            bw.write((x + y) + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
