package baekjoon;

import java.io.*;

public class Baekjoon_24416 {

    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        fibonacci1(n);
        fibonacci2(n);

        bw.write(count1 + " " + count2);
        bw.flush();
        bw.close();
        br.close();

    }

    private static int fibonacci1(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        }
        return (fibonacci1(n - 1) + fibonacci1(n - 2));
    }

    private static int fibonacci2(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1]; // 결과 저장용 배열
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            count2++;
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}
