package baekjoon;

import java.io.*;

public class Baekjoon_14582 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalW = 0;
        int totalS = 0;
        boolean winMoment = false; // 이기고 있던 순간

        String[] w = br.readLine().split(" "); // 울림
        String[] s = br.readLine().split(" "); // 스타트링크

        for (int i = 0; i < 9; i++) {
            totalW += Integer.parseInt(w[i]);
            if (totalW > totalS) {
                winMoment = true;
                break;
            }
            totalS += Integer.parseInt(s[i]);

        }

        if (winMoment) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
