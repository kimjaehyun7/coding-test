package baekjoon;

import java.io.*;

public class Baekjoon_20361 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int current = x;

        for (int i = 0; i < k; i++) {
            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);

            if (a == current) {
                current = b;
                continue;
            }
            if (b == current) {
                current = a;
            }
        }

        bw.write(current + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
