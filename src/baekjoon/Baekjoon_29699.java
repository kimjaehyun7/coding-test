package baekjoon;

import java.io.*;

public class Baekjoon_29699 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String label = "CWelcomeToSMUP";

        int n = Integer.parseInt(br.readLine()) % 14;

        bw.write(label.charAt(n) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
