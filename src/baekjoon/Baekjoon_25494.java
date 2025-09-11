package baekjoon;

import java.io.*;

public class Baekjoon_25494 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            int count = 0;

            for (int j = 1; j <= a; j++) {
                for (int k = 1; k <= b; k++) {
                    for (int l = 1; l <= c; l++) {
                        if (j % k == k % l && k % l == l % j) {
                            count++;
                        }
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
