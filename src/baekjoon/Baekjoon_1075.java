package baekjoon;

import java.io.*;

public class Baekjoon_1075 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = (Integer.parseInt(br.readLine()) / 100) * 100;
        int f = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = n; i <= n + 99; i++) {
            if (i % f == 0) {
                ans = i;
                break;
            }
        }
        String s = String.valueOf(ans);

        bw.write(s.charAt(s.length() - 2) + "");
        bw.write(s.charAt(s.length() - 1) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
