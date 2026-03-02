package baekjoon;

import java.io.*;

public class Baekjoon_15904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] ucpc = {'U', 'C', 'P', 'C'};
        int count = 0;

        for (char c : br.readLine().toCharArray()) {
            if (c == ucpc[count]) {
                count++;
            }
            if (count == 4) {
                break;
            }
        }

        if (count == 4) {
            bw.write("I love UCPC");
        } else {
            bw.write("I hate UCPC");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
