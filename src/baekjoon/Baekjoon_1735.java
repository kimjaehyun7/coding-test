package baekjoon;

import java.io.*;

public class Baekjoon_1735 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]); // 분모

        String[] arr1 = br.readLine().split(" ");
        int c = Integer.parseInt(arr1[0]);
        int d = Integer.parseInt(arr1[1]); // 분모

        int numerator = (a * d) + (b * c); // 분자
        int denominator = b * d; // 분모

        int gcd = gcd(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;

        bw.write(numerator + " " + denominator);
        bw.flush();
        bw.close();
        br.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
