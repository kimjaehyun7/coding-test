package codeforces;

import java.io.*;

public class Code_1476A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] sp = br.readLine().split(" ");
            long n = Long.parseLong(sp[0]);
            long k = Long.parseLong(sp[1]);

            long a = n / k;
            long b = (n % k == 0) ? 0 : 1;

            long s = (a + b) * k;

            long result = (s + n - 1) / n;

            bw.write(result + "\n");
        }
        bw.flush();
    }
}
