package baekjoon;

import java.io.*;

public class Baekjoon_10829 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine());

        while (n != 0) {
            long remain = n % 2;
            sb.append(remain);
            n /= 2;
        }
        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
