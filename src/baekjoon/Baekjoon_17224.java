package baekjoon;

import java.io.*;

public class Baekjoon_17224 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 문제 개수
        int l = Integer.parseInt(s[1]); // 역량
        int k = Integer.parseInt(s[2]); // 최대 개수
        int result = 0;
        int diff = 0;

        for (int i = 1; i <= n; i++) {
            String[] sp = br.readLine().split(" ");
            int sub1 = Integer.parseInt(sp[0]);
            int sub2 = Integer.parseInt(sp[1]);

            if (i > k) {
                if (l >= sub2 && diff < k) {
                    result += 40;
                    diff++;
                }
            } else if (l >= sub2) {
                result += 140;
                diff++;
            } else if (l >= sub1) {
                result += 100;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
