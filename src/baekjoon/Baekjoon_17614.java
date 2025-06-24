package baekjoon;

import java.io.*;

public class Baekjoon_17614 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int clap = 0;

        for (int i = 1; i <= n; i++) {
            for (char c : String.valueOf(i).toCharArray()) {
                if (c == '3' || c == '6' || c == '9') {
                    clap++;
                }
            }
        }
        bw.write(clap+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
