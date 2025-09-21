package baekjoon;

import java.io.*;

public class Baekjoon_26209 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean valid = true;
        for (String s : br.readLine().split(" ")) {
            if (s.equals("9")) {
                valid = false;
            }
        }

        if (valid) {
            bw.write("S");
        } else {
            bw.write("F");
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
