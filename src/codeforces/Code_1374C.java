package codeforces;

import java.io.*;

public class Code_1374C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int wrongCount = 0;

            int left = 0; // 여는 괄호

            for (char c : br.readLine().toCharArray()) {
                if (c == '(') {
                    left++;
                } else {
                    if (left == 0) {
                        wrongCount++;
                    } else {
                        left--;
                    }
                }
            }
            wrongCount += left;
            bw.write((wrongCount / 2) + "\n");
        }
        bw.flush();
    }
}
