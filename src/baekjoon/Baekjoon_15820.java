package baekjoon;

import java.io.*;

public class Baekjoon_15820 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]); // 샘플 테스트케이스 개수
        int s2 = Integer.parseInt(s[1]); // 시스템 테스트케이스 개수

        boolean test = true;
        boolean sys = true;

        for (int i = 0; i < s1; i++) {
            String[] sp = br.readLine().split(" ");
            if (!sp[0].equals(sp[1])) {
                test = false;
            }
        }

        for (int i = 0; i < s2; i++) {
            String[] sp = br.readLine().split(" ");
            if (!sp[0].equals(sp[1])) {
                sys = false;
            }
        }

        if (test && sys) {
            bw.write("Accepted");
        } else if (!test) {
            bw.write("Wrong Answer");
        } else {
            bw.write("Why Wrong!!!");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
