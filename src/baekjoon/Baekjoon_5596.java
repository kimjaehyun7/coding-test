package baekjoon;

import java.io.*;

public class Baekjoon_5596 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = 0;
        int t = 0;
        for (String string : br.readLine().split(" ")) {
            s += Integer.parseInt(string);
        }
        for (String string : br.readLine().split(" ")) {
            t += Integer.parseInt(string);
        }

        if (s >= t) {
            bw.write(s + "");
        } else {
            bw.write(t + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
