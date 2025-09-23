package baekjoon;

import java.io.*;

public class Baekjoon_14920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        int n = 1;

        while (c != 1) {
            if (c % 2 == 0) {
                c /= 2;
                n++;
            } else {
                c = 3 * c + 1;
                n++;
            }
        }

        bw.write(n + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
