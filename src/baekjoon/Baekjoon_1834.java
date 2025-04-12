package baekjoon;

import java.io.*;

public class Baekjoon_1834 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long sum = (n + 1) * (n - 1) * n / 2;
        bw.write(sum+"");


        bw.flush();
        bw.close();
        br.close();

    }


}
