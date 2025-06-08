package baekjoon;

import java.io.*;

public class Baekjoon_4458 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char c = input.charAt(0);
            String upper = String.valueOf(c).toUpperCase();
            String result = upper + input.substring(1) + "\n";
            bw.write(result);
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
