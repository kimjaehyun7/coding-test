package baekjoon;

import java.io.*;

public class Baekjoon_5789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = s.length() / 2;
            String result = s.substring(a - 1, a + 1);
            if (result.charAt(0) == result.charAt(1)) {
                bw.write("Do-it\n");
            } else {
                bw.write("Do-it-Not\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
