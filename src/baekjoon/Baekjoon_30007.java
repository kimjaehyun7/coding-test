package baekjoon;

import java.io.*;

public class Baekjoon_30007 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            int X = Integer.parseInt(s[2]);

            int W = A * (X - 1) + B;
            bw.write(W + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
