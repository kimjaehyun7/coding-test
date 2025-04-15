package baekjoon;

import java.io.*;

public class Baekjoon_1964 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long dots = 5;
        int next = 7;

        for (int i = 1; i < n; i++) {
            dots +=  next;
            next += 3;
        }

        bw.write((dots%45678)+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
