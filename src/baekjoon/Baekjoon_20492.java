package baekjoon;

import java.io.*;

public class Baekjoon_20492 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int case1 = n * 78 / 100;
        int case2 = (n * 80 / 100) + (n * 20 / 100) * 78 / 100;

        bw.write(case1 + " " + case2);
        bw.flush();
        bw.close();
        br.close();
    }
}
