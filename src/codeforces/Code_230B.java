package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_230B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[] primes = getPrimes();

        for (long i : Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray()) {
            boolean tPrime = false;
            double sqrt = Math.sqrt(i);
            if (sqrt % 1 == 0) {
                if (!primes[(int) sqrt]) {
                    tPrime = true;
                }
            }
            if (tPrime) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }

    static boolean[] getPrimes() {
        boolean[] primes = new boolean[1000001];
        primes[0] = primes[1] = true;

        for (int i = 2; i * i < primes.length; i++) {
            if (!primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = true;
                }
            }
        }
        return primes;
    }
}
