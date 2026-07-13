package codeforces;

import java.io.*;

public class Code_996A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        while (n != 0) {
            if (n >= 100) {
                count += n / 100;
                n = n % 100;
            } else if (n >= 20) {
                count += n / 20;
                n = n % 20;
            } else if (n >= 10) {
                count += n / 10;
                n = n % 10;
            } else if (n >= 5) {
                count += n / 5;
                n = n % 5;
            } else {
                count += n;
                n = 0;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
