package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_2355 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        long first = Integer.parseInt(split[0]);
        long last = Integer.parseInt(split[1]);
        if (first > last) {
            long temp = first;
            first = last;
            last = temp;
        }
        long term = last - first + 1;
        long sum = term * (first + last) / 2;
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
