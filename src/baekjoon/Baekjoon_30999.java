package baekjoon;

import java.io.*;

public class Baekjoon_30999 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int count = 0;

        for (int i = 0; i < N; i++) {
            int o = 0;
            int x = 0;

            for (char c : br.readLine().toCharArray()) {
                if (c == 'O') {
                    o++;
                } else {
                    x++;
                }
            }

            if (o > x) {
                count++;
            }

        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
