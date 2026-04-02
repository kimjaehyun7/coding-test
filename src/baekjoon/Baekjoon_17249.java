package baekjoon;

import java.io.*;

public class Baekjoon_17249 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int left = 0;
        int right = 0;
        boolean isLeft = true;
        for (String s : br.readLine().split("")) {
            if (s.equals("(")) {
                isLeft = false;
            }

            if (s.equals("@")) {
                if (isLeft) {
                    left++;
                } else {
                    right++;
                }
            }
        }

        bw.write(left + " " + right);
        bw.flush();
        bw.close();
        br.close();
    }
}
