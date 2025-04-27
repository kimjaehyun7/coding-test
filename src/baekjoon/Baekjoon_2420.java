package baekjoon;

import java.io.*;

public class Baekjoon_2420 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        long n = Long.parseLong(split[0]);
        long m = Long.parseLong(split[1]);

        bw.write(Math.abs(n - m) + "");
        bw.flush();
        bw.close();
        br.close();

    }

}
