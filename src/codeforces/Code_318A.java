package codeforces;

import java.io.*;

public class Code_318A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long n = Long.parseLong(s[0]);
        long k = Long.parseLong(s[1]);

        long mid = (n + 1) / 2;

        boolean isOdd = true;

        if (k > mid) {
            k -= mid;
            isOdd = false;
        }

        long result;
        if (isOdd) { // 홀수
            result = 1;
        } else { // 짝수
            result = 2;
        }
        result += (k - 1) * 2;

        bw.write(result + "");
        bw.flush();
    }
}
