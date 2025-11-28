package baekjoon;

import java.io.*;

public class Baekjoon_31450 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        if (M % K == 0) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
