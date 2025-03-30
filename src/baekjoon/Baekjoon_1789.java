package baekjoon;

import java.io.*;

public class Baekjoon_1789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine()); // 최대 입력 4294967295
        long sum = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            sum += i;
            if (sum == s) { // 더하다가 나누어 떨어지면 i값이 최대 개수
                bw.write(i+"");
                break;
            } else if (sum > s) { // 초과하면 i값에서 하나 뺀 값이 최대 개수
                bw.write((i-1)+"");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
