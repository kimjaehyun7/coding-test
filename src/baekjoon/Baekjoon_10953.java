package baekjoon;

import java.io.*;

public class Baekjoon_10953 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (String s : br.readLine().split(",")) {
                sum += Integer.parseInt(s);
            }
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
