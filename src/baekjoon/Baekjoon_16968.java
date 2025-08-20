package baekjoon;

import java.io.*;

public class Baekjoon_16968 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char pre = 0;
        int count = 1;
        for (char c : br.readLine().toCharArray()) {
            if (c == 'd') {
                if (c == pre) {
                    count *= 9;
                } else {
                    count *= 10;
                }
                pre = c;
            } else {
                if (c == pre) {
                    count *= 25;
                } else {
                    count *= 26;
                }
                pre = c;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
