package baekjoon;

import java.io.*;

public class Baekjoon_5928 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int start = (((11 * 24) + 11) * 60) + 11;

        int d = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]) + (d * 24);
        int m = Integer.parseInt(s[2]) + (h * 60);

        int result = m - start;
        if (result < 0) {
            bw.write("-1");
        } else {
            bw.write(result + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
