package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_4948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> primes = getPrimes();

        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            int count = 0;

            for (Integer prime : primes) {
                if (n < prime && (n * 2) >= prime) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static List<Integer> getPrimes() {
        boolean[] isNotPrimes = new boolean[246913];
        List<Integer> primes = new ArrayList<>();

        isNotPrimes[0] = isNotPrimes[1] = true; // 0,1은 소수 아님
        for (int i = 2; i * i < isNotPrimes.length; i++) {
            if (!isNotPrimes[i]) {
                for (int j = i * i; j < isNotPrimes.length; j += i) { // 자신을 제외한 모든 배수 제거
                    isNotPrimes[j] = true;
                }
            }
        }
        for (int i = 0; i < isNotPrimes.length; i++) {
            if (!isNotPrimes[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
