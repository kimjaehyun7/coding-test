package baekjoon;

import java.io.*;

public class Baekjoon_23235 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String s;
        while (!(s = br.readLine()).equals("0")) {
            count++;
        }

        for (int i = 1; i <= count; i++) {
            bw.write("Case " + i + ": Sorting... done!\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
