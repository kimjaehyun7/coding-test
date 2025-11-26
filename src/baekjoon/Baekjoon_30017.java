package baekjoon;

import java.io.*;

public class Baekjoon_30017 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if (a > b) {
            a = b + 1;
        } else {
            b = a - 1;
        }

        bw.write(a + b + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
