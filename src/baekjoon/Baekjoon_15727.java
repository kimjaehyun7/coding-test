package baekjoon;

import java.io.*;

public class Baekjoon_15727 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());

        if (l % 5 == 0) {
            bw.write(l / 5 + "");
        } else {
            bw.write(l / 5 + 1 + "");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
