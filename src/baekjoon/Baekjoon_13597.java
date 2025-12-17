package baekjoon;

import java.io.*;

public class Baekjoon_13597 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        bw.write(Math.max(A, B) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
