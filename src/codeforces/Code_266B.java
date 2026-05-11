package codeforces;

import java.io.*;

public class Code_266B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 대기열에 있는 자식의 수
        int t = Integer.parseInt(s[1]); // 변환되는데 걸리는 시간

        String[] sp = br.readLine().split("");

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < sp.length - 1; j++) {
                if (sp[j].equals("B") && sp[j + 1].equals("G")) {
                    sp[j] = "G";
                    sp[j + 1] = "B";
                    j++;
                }
            }
        }

        for (String str : sp) {
            bw.write(str);
        }
        bw.flush();
    }
}
