package baekjoon;

import java.io.*;

public class Baekjoon_9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int value = 0;
            boolean isVps = true;

            for (char c : br.readLine().toCharArray()) {
                if (c == '(') {
                    value++;
                } else { // ')'
                    value--;
                }
                if (value < 0) {
                    isVps = false;
                    break;
                }
            }
            if (value > 0) {
                isVps = false;
            }
            if (isVps) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
