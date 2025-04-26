package baekjoon;

import java.io.*;

public class Baekjoon_2441 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            bw.write("\n");
            count++;
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
