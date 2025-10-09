package baekjoon;

import java.io.*;

public class Baekjoon_9366 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            if (a == b && b == c) {
                bw.write("Case #" + i + ": equilateral\n");
            } else if ((a == b && (a + b) > c) ||
                    (b == c && (b + c) > a) ||
                    (a == c && (a + c) > b)
            ) {
                bw.write("Case #" + i + ": isosceles\n");
            } else if ((a != b && b != c && a != c) &&
                    a + b > c && b + c > a && a + c > b
            ) {
                bw.write("Case #" + i + ": scalene\n");
            } else {
                bw.write("Case #" + i + ": invalid!\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
