package baekjoon;

import java.io.*;

public class Baekjoon_21598 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write("SciComLove\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
