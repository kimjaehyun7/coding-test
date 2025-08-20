package baekjoon;

import java.io.*;

public class Baekjoon_15232 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
