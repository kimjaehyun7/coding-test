package baekjoon;

import java.io.*;

public class Baekjoon_1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);

        if (b >= c) {
            bw.write("-1");
        } else {
            int p = c - b;
            int sales = (a / p) + 1;
            bw.write(sales+"");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
