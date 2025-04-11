package baekjoon;

import java.io.*;

public class Baekjoon_1773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int c = Integer.parseInt(split[1]);
        boolean[] fire = new boolean[c+1]; // 0초 ~ c초
        int count = 0;

        for (int i = 0; i < n; i++) {
            int st = Integer.parseInt(br.readLine());
            for (int j = st; j < fire.length; j += st) {
                if (!fire[j]) {
                    fire[j] = true;
                    count++;
                }
            }
        }
        bw.write(count+"");


        bw.flush();
        bw.close();
        br.close();

    }
}