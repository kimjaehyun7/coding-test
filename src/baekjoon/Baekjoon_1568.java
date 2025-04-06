package baekjoon;

import java.io.*;

public class Baekjoon_1568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int time = 0;

        while (n > 0) {
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (n >= i) {
                    n -= i;
                    time++;
                } else {
                    break;
                }
            }
        }
        bw.write(time+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
