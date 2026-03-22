package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_1644 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> primes = getPrimes(N);

        int sum = 0;
        int left = 0;
        int count = 0;

        for (int right = 0; right < primes.size(); right++) {
            sum += primes.get(right);

            while (sum > N) {
                sum -= primes.get(left++);
            }

            if (sum == N) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }

    static List<Integer> getPrimes(int n) {
        boolean[] numbers = new boolean[n + 1];
        numbers[0] = numbers[1] = true; // true 면 소수가 아님
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i * i < numbers.length; i++) {
            if (!numbers[i]) {
                for (int j = i * i; j <= n; j += i) {
                    numbers[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!numbers[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
