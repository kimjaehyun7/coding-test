package codeforces;

import java.io.*;

public class Code_268A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] colors = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int h = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);

            colors[i] = new int[]{h, a};
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (colors[i][0] == colors[j][1]) {
                        count++;
                    }
                }
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
