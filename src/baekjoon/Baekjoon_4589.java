package baekjoon;

import java.io.*;

public class Baekjoon_4589 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Gnomes:\n");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            if ((a < b && b < c) || (a > b && b > c)) {
                bw.write("Ordered\n");
            } else {
                bw.write("Unordered\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
