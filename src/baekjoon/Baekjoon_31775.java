package baekjoon;

import java.io.*;

public class Baekjoon_31775 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean startL = false;
        boolean startK = false;
        boolean startP = false;

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();

            if (s.startsWith("l")) {
                startL = true;
            }
            if (s.startsWith("k")) {
                startK = true;
            }
            if (s.startsWith("p")) {
                startP = true;
            }
        }

        if (startL && startK && startP) {
            bw.write("GLOBAL");
        } else {
            bw.write("PONIX");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
