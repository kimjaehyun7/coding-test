package baekjoon;

import java.io.*;

public class Baekjoon_4779 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Math.pow(3, n); i++) {
                sb.append("-");
            }
            bw.write(cut(sb) + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static StringBuilder cut(StringBuilder sb) {
        if (sb.length()==1) return sb; // 0승
        StringBuilder left = new StringBuilder().append(sb.substring(0, sb.length() / 3));
        String mid = " ".repeat(sb.length() / 3);
        StringBuilder right = new StringBuilder().append(sb.substring(0, sb.length() / 3));

        StringBuilder result = new StringBuilder();
        return result.append(cut(left)).append(mid).append(cut(right));
    }
}
