package baekjoon;

import java.io.*;

public class Baekjoon_8710 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int k = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int m = Integer.parseInt(s[2]);
        int count = 0;

        while (k < w) {
            k += m;
            count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
