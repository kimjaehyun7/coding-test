package baekjoon;

import java.io.*;

public class Baekjoon_2979 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int[] time = new int[101];
        int total = 0;
        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            int arrive = Integer.parseInt(s[0]);
            int leave = Integer.parseInt(s[1]);
            for (int j = arrive; j < leave; j++) {
                time[j]++;
            }
        }
        for (int i : time) {
            switch (i) {
                case 1:
                    total += a;
                    break;
                case 2:
                    total += b * 2;
                    break;
                case 3:
                    total += c * 3;
            }
        }
        bw.write(total + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
