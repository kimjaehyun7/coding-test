package baekjoon;

import java.io.*;

public class Baekjoon_4999 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int jae = br.readLine().length();
        int doc = br.readLine().length();

        if (jae >= doc) {
            bw.write("go");
        } else {
            bw.write("no");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
