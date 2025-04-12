package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_1816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> primes = getPrimes();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long l = Long.parseLong(br.readLine());
            boolean key = true;

            for (Integer prime : primes) {
                if (l % prime == 0) {
                    key = false;
                }
            }
            if (key) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static List<Integer> getPrimes() {
        boolean[] isNotPrime = new boolean[1000001];
        List<Integer> primes = new ArrayList<>();

        isNotPrime[0] = isNotPrime[1] = true; // 0과 1은 소수가 아님

        for (int i = 2; i * i < isNotPrime.length; i++) { // 100만의 제곱근까지만 검사
            if (!isNotPrime[i]) {
                for (int j = i * i; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = 2; i < isNotPrime.length; i++) {
            if (!isNotPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

}
