package baekjoon;

import java.io.*;

public class Baekjoon_30224 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(str);

        if (str.contains("7")) {
            if (n % 7 == 0) {
                bw.write("3");
            } else {
                bw.write("2");
            }
        } else {
            if (n % 7 == 0) {
                bw.write("1");
            } else {
                bw.write("0");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
