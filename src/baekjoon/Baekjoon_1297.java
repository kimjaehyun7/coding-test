package baekjoon;

import java.io.*;

public class Baekjoon_1297 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        double d = Double.parseDouble(split[0]);
        double h = Double.parseDouble(split[1]); // 높이 비율
        double w = Double.parseDouble(split[2]); // 너비 비율

        double k = d / Math.sqrt(h * h + w * w); // k x h : 높이 , k x w : 너비

        bw.write((int)Math.floor(k*h) + " ");
        bw.write((int)Math.floor(k*w) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
