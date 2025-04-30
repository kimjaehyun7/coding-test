package baekjoon;

import java.io.*;

public class Baekjoon_2576 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int min = 100;

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 1) {
                sum += num;
                if (min > num) {
                    min = num;
                }
            }
        }
        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(sum + "\n" + min);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
