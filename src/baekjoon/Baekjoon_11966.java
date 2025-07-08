package baekjoon;

import java.io.*;

public class Baekjoon_11966 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean isSquare = false;

        for (int i = 0; i <= 30; i++) {
            int pow = (int) Math.pow(2, i);
            if (n == pow) {
                isSquare = true;
            }
        }

        if (isSquare) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
