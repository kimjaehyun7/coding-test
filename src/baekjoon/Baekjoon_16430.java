package baekjoon;

import java.io.*;

public class Baekjoon_16430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int n = b - a;

        if (n == 0) {
            bw.write("0");
        } else {
            bw.write(n + " " + b);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
