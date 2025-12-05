package baekjoon;

import java.io.*;

public class Baekjoon_7595 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
