package baekjoon;

import java.io.*;

public class Baekjoon_11134 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int c = Integer.parseInt(s[1]);

            if (n % c == 0) {
                bw.write(n / c + "\n");
            } else {
                bw.write((n / c + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
