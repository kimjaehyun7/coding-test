package baekjoon;

import java.io.*;

public class Baekjoon_29790 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]); // 문제 수
        int U = Integer.parseInt(s[1]); // 유니온 레벨
        int L = Integer.parseInt(s[2]); // 최고 레벨

        if (N >= 1000) {
            if (U >= 8000 || L >= 260) {
                bw.write("Very Good");
            } else {
                bw.write("Good");
            }
        } else {
            bw.write("Bad");
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
