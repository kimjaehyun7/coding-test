package codeforces;

import java.io.*;

public class Code_1342A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int min = Math.min(x, y);
            int max = Math.max(x, y);

            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]); // x or y 중 하나 증감
            int b = Integer.parseInt(sp[1]); // x,y 한번에 증감

            long result;
            if (a * 2 < b) {
                result = (long) a * (x + y);
            } else {
                result = (long) b * min + (long) a * (max - min);
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
