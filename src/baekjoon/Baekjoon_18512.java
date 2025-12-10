package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_18512 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int X = Integer.parseInt(s[0]);
        int Y = Integer.parseInt(s[1]);
        int P1 = Integer.parseInt(s[2]); // x 시작
        int P2 = Integer.parseInt(s[3]); // y 시작

        Set<Integer> set = new HashSet<>();
        while (true) {
            if (!set.add(P1)) {
                bw.write(P1 + "");
                break;
            }
            if (!set.add(P2)) {
                bw.write(P2 + "");
                break;
            }
            P1 += X;
            P2 += Y;

            if (set.size() >= 1000000) {
                bw.write("-1");
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
