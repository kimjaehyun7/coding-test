package baekjoon;

import java.io.*;

public class Baekjoon_16486 {

    static double PI = 3.141592;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double result = (d1 * 2) + (2 * PI * d2);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
