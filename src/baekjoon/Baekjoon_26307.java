package baekjoon;

import java.io.*;

public class Baekjoon_26307 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int hh = Integer.parseInt(s[0]) - 9;
        int mm = Integer.parseInt(s[1]);

        int result = (hh * 60) + mm;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
