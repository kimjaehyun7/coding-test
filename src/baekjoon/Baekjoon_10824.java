package baekjoon;

import java.io.*;

public class Baekjoon_10824 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        String ab = split[0] + split[1];
        String cd = split[2] + split[3];

        long abcd = Long.parseLong(ab) + Long.parseLong(cd);

        bw.write(abcd+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
