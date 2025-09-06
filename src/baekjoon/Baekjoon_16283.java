package baekjoon;

import java.io.*;

public class Baekjoon_16283 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]); // 양 한 마리 사료
        int b = Integer.parseInt(s[1]); // 염소 한 마리 사료
        int n = Integer.parseInt(s[2]); // 양 + 염소
        int w = Integer.parseInt(s[3]); // 소비한 사료 양
        String result = "-1";

        for (int i = 1; i < n; i++) {
            int sheep = i;
            int goat = n - i;

            if ((sheep * a) + (goat * b) == w) {
                if (!result.equals("-1")) {
                    result = "-1";
                    break;
                }
                result = sheep + " " + goat;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
