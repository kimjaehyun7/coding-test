package baekjoon;

import java.io.*;

public class Baekjoon_12605 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            bw.write("Case #" + i + ": ");
            String[] s = br.readLine().split(" ");
            for (int j = s.length - 1; j >= 0; j--) {
                bw.write(s[j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
