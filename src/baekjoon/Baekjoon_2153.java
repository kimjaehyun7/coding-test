package baekjoon;

import java.io.*;

public class Baekjoon_2153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (char c : br.readLine().toCharArray()) {
            sum += getSum(c);
        }

        if (isPrime(sum)) {
            bw.write("It is a prime word.");
        } else {
            bw.write("It is not a prime word.");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getSum(char c) {
        return c >= 97 && c <= 122 ? (int) c - '`' : (int) c - '&';
    }

    private static boolean isPrime(int n) { // 예외적으로 1도 소수.
        if (n == 1) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
