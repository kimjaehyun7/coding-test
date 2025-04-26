package baekjoon;

import java.io.*;

public class Baekjoon_11050 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        long result = factorial(n) / (factorial(k) * factorial(n - k));

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static long factorial(int n) {
        long num = 1;
        for (int i = 2; i <= n; i++) {
            num *= i;
        }
        return num;
    }
}
