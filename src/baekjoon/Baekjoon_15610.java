package baekjoon;

import java.io.*;

public class Baekjoon_15610 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());

        double result = Math.sqrt(a) * 4;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
