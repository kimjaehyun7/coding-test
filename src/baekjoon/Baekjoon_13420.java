package baekjoon;

import java.io.*;

public class Baekjoon_13420 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            long a = Long.parseLong(s[0]);
            String sign = s[1];
            long b = Long.parseLong(s[2]);
            long c = Long.parseLong(s[4]);
            long result;

            if (sign.equals("+")) {
                result = a + b;
            } else if (sign.equals("-")) {
                result = a - b;
            } else if (sign.equals("*")) {
                result = a * b;
            } else {
                result = a / b;
            }

            if (result == c) {
                bw.write("correct\n");
            } else {
                bw.write("wrong answer\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
