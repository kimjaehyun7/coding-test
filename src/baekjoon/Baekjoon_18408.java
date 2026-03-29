package baekjoon;

import java.io.*;

public class Baekjoon_18408 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int one = 0;
        int two = 0;
        for (String s : br.readLine().split(" ")) {
            if (s.equals("1")) {
                one++;
            } else {
                two++;
            }
        }

        if (one > two) {
            bw.write("1");
        } else {
            bw.write("2");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
