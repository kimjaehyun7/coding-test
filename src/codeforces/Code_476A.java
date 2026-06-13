package codeforces;

import java.io.*;

public class Code_476A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // n칸의 계단 올라가려고함
        int m = Integer.parseInt(s[1]); // 이동횟수가 m의 배수가 되어야한다

        double ceil = Math.ceil((double) n / 2);

        int result = -1;

        for (int i = (int) ceil; i <= n; i++) {
            if (i % m == 0) {
                result = i;
                break;
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}
