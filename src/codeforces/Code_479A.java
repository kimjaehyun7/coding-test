package codeforces;

import java.io.*;

public class Code_479A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int case1 = Math.max(a + b * c, Math.max((a + b) * c, a + (b * c)));
        int case2 = Math.max(a * b + c, Math.max((a * b) + c, a * (b + c)));
        int case3 = a + b + c;
        int case4 = a * b * c;

        int max = Math.max(case1, Math.max(case2, Math.max(case3, case4)));

        bw.write(max + "");
        bw.flush();
    }
}
