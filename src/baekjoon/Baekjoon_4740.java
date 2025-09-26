package baekjoon;

import java.io.*;

public class Baekjoon_4740 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("***")) {
            bw.write(new StringBuilder(s).reverse() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
