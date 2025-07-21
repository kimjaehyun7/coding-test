package baekjoon;

import java.io.*;

public class Baekjoon_24568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        int cups = (r * 8) + (s * 3);

        bw.write(cups - 28 + "");

        bw.flush();
        bw.close();
        br.close();

    }
}
