package baekjoon;

import java.io.*;

public class Baekjoon_15726 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long c = Long.parseLong(split[2]);

        if (b <= c) {
            bw.write((a * c) / b + "");
        } else {
            bw.write((a * b) / c + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
