package baekjoon;

import java.io.*;

public class Baekjoon_15780 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 학생의 수
        int k = Integer.parseInt(s[1]); // 멀티탭의 수
        int result = 0;

        String[] multi = br.readLine().split(" "); // 모든 멀티탭의 구의 수

        for (String str : multi) {
            int m = Integer.parseInt(str);
            if (m % 2 == 0) {
                result += m / 2;
            } else {
                result += m / 2 + 1;
            }
        }
        if (n <= result) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
