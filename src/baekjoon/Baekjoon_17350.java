package baekjoon;

import java.io.*;

public class Baekjoon_17350 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean anj = false;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("anj")) {
                anj = true;
                break;
            }
        }

        if (anj) {
            bw.write("뭐야;");
        } else {
            bw.write("뭐야?");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
