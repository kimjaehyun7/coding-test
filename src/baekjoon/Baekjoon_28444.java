package baekjoon;

import java.io.*;

public class Baekjoon_28444 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int H = Integer.parseInt(s[0]);
        int I = Integer.parseInt(s[1]);
        int A = Integer.parseInt(s[2]);
        int R = Integer.parseInt(s[3]);
        int C = Integer.parseInt(s[4]);

        int result = (H * I) - (A * R * C);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
