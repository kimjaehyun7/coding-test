package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        List<Integer> primes = getPrimes();

        for (Integer prime : primes) {
            if (m <= prime && n >= prime) {
                bw.write(prime + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static List<Integer> getPrimes() {
        boolean[] isNotPrime = new boolean[1000001];
        List<Integer> primes = new ArrayList<>();
        isNotPrime[0] = isNotPrime[1] = true; // 0,1은 소수가 아님

        for (int i = 2; i * i < isNotPrime.length; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < isNotPrime.length; j += i) { // 해당 소수를 제외한 배수 전부 true 로 만들어줌
                    isNotPrime[j] = true;
                }
            }
        }
        for (int i = 0; i < isNotPrime.length; i++) {
            if (!isNotPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
