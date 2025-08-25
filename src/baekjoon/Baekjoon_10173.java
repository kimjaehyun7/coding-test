package baekjoon;

import java.io.*;

public class Baekjoon_10173 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("EOI")) {
            if (s.toLowerCase().contains("nemo")) {
                bw.write("Found\n");
            } else {
                bw.write("Missing\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
