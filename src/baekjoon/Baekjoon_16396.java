package baekjoon;

import java.io.*;

public class Baekjoon_16396 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        boolean[] line = new boolean[10001];
        int result = 0;

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            for (int j = x; j < y; j++) {
                if (!line[j]) {
                    line[j] = true;
                    result++;
                }
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
