package baekjoon;

import java.io.*;

public class Baekjoon_30030 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int B = Integer.parseInt(br.readLine());

        int result = B / 11 * 10;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
