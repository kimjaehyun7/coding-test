package codeforces;

import java.io.*;

public class Code_148A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 ||
                    i % m == 0 || i % n == 0) {
                count++;
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}
