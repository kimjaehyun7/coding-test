package baekjoon;

import java.io.*;

public class Baekjoon_2789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String replaced = word.replaceAll("[CAMBRIDGE]", "");

        bw.write(replaced);
        bw.flush();
        bw.close();
        br.close();
    }
}
