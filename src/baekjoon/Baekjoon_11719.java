package baekjoon;

import java.io.*;

public class Baekjoon_11719 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            bw.write(s+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
