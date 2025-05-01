package baekjoon;

import java.io.*;

public class Baekjoon_10156 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int k = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        int m = Integer.parseInt(split[2]);

        int money = (k * n) - m;
        if (money <= 0) {
            bw.write("0");
        } else {
            bw.write(money+"");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
