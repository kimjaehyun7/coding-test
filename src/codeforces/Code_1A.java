package codeforces;

import java.io.*;

public class Code_1A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);
        long a = Long.parseLong(s[2]);

        long result = 0;

        long r = 0;

        if (n % a == 0) {
            r = (n / a);
        } else {
            r = (n / a) + 1;
        }

        if (m % a == 0) {
            result += (m / a) * r;
        } else {
            result += ((m / a) + 1) * r;
        }

        bw.write(result + "");
        bw.flush();
    }
}
