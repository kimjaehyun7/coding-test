package baekjoon;

import java.io.*;

public class Baekjoon_2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            int sum = getSum(i);
            if (n == sum) {
                bw.write(i + "");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }

        bw.write("0");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getSum(int i) {
        int result = i;
        String s = String.valueOf(i);
        for (char c : s.toCharArray()) {
            result += c - '0';
        }
        return result;
    }
}
