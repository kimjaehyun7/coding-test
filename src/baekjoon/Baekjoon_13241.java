package baekjoon;

import java.io.*;

public class Baekjoon_13241 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);

        long gcd = gcd(a, b);
        long lcm = a * b / gcd;

        bw.write(lcm + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
