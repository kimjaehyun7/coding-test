package codeforces;

import java.io.*;

public class Code_1690D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            int min = 0;
            char[] array = br.readLine().toCharArray();
            for (int j = 0; j < k; j++) {
                if (array[j] == 'W') {
                    min++;
                }
            }

            int wCount = min;
            for (int j = k; j < n; j++) {
                int idx = j - k;

                if (array[idx] == 'W') {
                    wCount--;
                }
                if (array[j] == 'W') {
                    wCount++;
                }
                min = Math.min(min, wCount);
            }
            bw.write(min + "\n");
        }
        bw.flush();
    }
}
