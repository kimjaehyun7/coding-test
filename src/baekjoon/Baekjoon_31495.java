package baekjoon;

import java.io.*;

public class Baekjoon_31495 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        if (s.equals("\"\"") || s.equals("\"")) {
            bw.write("CE");
        } else if (s.charAt(0) == '\"' && s.charAt(s.length() - 1) == '\"') {
            bw.write(s.substring(1, s.length() - 1));
        } else {
            bw.write("CE");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
