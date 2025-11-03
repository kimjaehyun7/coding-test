package baekjoon;

import java.io.*;

public class Baekjoon_16676 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 만약 3자리 이면 111부터 3개팩이 필요
        // 만약 4자리 이면 1111부터 4개팩이 필요

        String str = br.readLine();
        int n = Integer.parseInt(str);
        int length = str.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("1");
        }
        int m = Integer.parseInt(sb.toString());
        if (n >= m || n == 0) {
            bw.write(length + "");
        } else {
            bw.write(length - 1 + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
