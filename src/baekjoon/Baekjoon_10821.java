package baekjoon;

import java.io.*;

public class Baekjoon_10821 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine().split(",").length + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
