package baekjoon;

import java.io.*;

public class Baekjoon_10995 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String star = makeStar(n);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                bw.write(star + "\n");
            } else {
                bw.write(" " + star + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
    private static String makeStar(int n) {
        StringBuilder star = new StringBuilder("*");

        for (int i = 1; i < n; i++) {
            star.append(" *");
        }
        return star.toString();
    }
}
