package baekjoon;

import java.io.*;

public class Baekjoon_27465 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 10억이하
        boolean isFind = false;

        while (!isFind) {
            for (int i = 2; i * i < n; i++) {
                if (n % i == 0) {
                    isFind = true;
                }
            }
            if (!isFind) {
                n++;
            }
        }
        bw.write(n + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
