package baekjoon;

import java.io.*;

public class Baekjoon_10102 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;

        for (char c : br.readLine().toCharArray()) {
            if (c == 'A') {
                a++;
            } else {
                b++;
            }
        }

        if (a > b) {
            bw.write("A");
        } else if (b > a) {
            bw.write("B");
        } else {
            bw.write("Tie");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
