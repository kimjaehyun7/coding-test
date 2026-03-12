package baekjoon;

import java.io.*;

public class Baekjoon_29766 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] dksh = {'D', 'K', 'S', 'H'};

        int idx = 0;
        int count = 0;
        for (char c : br.readLine().toCharArray()) {
            if (c == dksh[idx]) {
                idx++;
            } else {
                if (c == 'D') {
                    idx = 1;
                } else {
                    idx = 0;
                }
            }
            if (idx == 4) {
                count++;
                idx = 0;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
