package baekjoon;

import java.io.*;

public class Baekjoon_25191 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int coke = Integer.parseInt(s[0]);
        int beer = Integer.parseInt(s[1]);
        int chicken = 0;

        chicken += coke / 2 + beer;

        if (chicken > n) {
            chicken = n;
        }

        bw.write(chicken + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
