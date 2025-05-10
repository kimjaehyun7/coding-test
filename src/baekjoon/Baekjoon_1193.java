package baekjoon;

import java.io.*;

public class Baekjoon_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;
            if (sum >= n) {
                int seq = n - (sum - i); // 순서
                int num = i + 1;
                if (num % 2 == 1) { // 분모, 분자의 합이 홀수이면
                    bw.write(seq + "/" + (num - seq));
                } else { // 짝수
                    bw.write((num - seq) + "/" + seq);
                }
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
