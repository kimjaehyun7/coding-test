package baekjoon;

import java.io.*;

public class Baekjoon_16673 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int c = Integer.parseInt(s[0]); // 와인을 모은 년수
        int k = Integer.parseInt(s[1]); // 애착 정도
        int p = Integer.parseInt(s[2]); // 구매중독 정도
        int count = 0;

        for (int i = 1; i <= c; i++) {
            count += (int) ((k * i) + (p * Math.pow(i, 2)));
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
