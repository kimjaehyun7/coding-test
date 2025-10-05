package baekjoon;

import java.io.*;

public class Baekjoon_15633 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        int result = sum * 5 - 24;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
