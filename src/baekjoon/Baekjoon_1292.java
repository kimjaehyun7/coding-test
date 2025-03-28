package baekjoon;

import java.io.*;

public class Baekjoon_1292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int sum = 0;
        int count = 0;

        for (int i = 1; count < b; i++) { // b번째 숫자까지만 생성
            for (int j = 0; j < i && count < b; j++) {
                count++;
                if (count >= a) {
                    sum += i;
                }
            }
        }
        bw.write(sum+"");


        bw.flush();
        bw.close();
        br.close();

    }
}
