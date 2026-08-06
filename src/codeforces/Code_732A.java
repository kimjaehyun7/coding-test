package codeforces;

import java.io.*;

public class Code_732A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);

        int count = 1;

        while (true) {
            int buy = k * count;

            if (buy % 10 == 0 || buy % 10 == r) {
                break;
            }
            count++;
        }

        if (count > 10) {
            count = 10;
        }

        bw.write(count + "");
        bw.flush();
    }
}
