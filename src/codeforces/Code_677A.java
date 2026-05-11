package codeforces;

import java.io.*;

public class Code_677A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);

        int count = 0;
        for (String str : br.readLine().split(" ")) {
            int a = Integer.parseInt(str);

            if (a > h) {
                count += 2;
            } else {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
