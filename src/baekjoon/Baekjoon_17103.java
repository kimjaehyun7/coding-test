package baekjoon;

import java.io.*;

public class Baekjoon_17103 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] primes = getPrimes();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= n / 2; j++) { // 중복제거를 위해 절반만 계산한다.
                if (!primes[j] && !primes[n - j]) { // 둘다 false 일시 소수 + 소수의 조합이 됨.
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean[] getPrimes() {
        boolean[] isNotPrimes = new boolean[1000001];

        isNotPrimes[0] = isNotPrimes[1] = true; // 0,1은 소수 x

        for (int i = 2; i * i < isNotPrimes.length; i++) {
            if (!isNotPrimes[i]) {
                for (int j = i * i; j < isNotPrimes.length; j += i) {
                    isNotPrimes[j] = true;
                }
            }
        }
        return isNotPrimes;
    }

}
