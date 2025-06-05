package baekjoon;

import java.io.*;

public class Baekjoon_14645 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);

        for (int i = 0; i < n; i++) {
            br.readLine();
        }

        bw.write("비와이");
        bw.flush();
        bw.close();
        br.close();
    }
}
