package baekjoon;

import java.io.*;

public class Baekjoon_23795 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        String s;
        while (!(s = br.readLine()).equals("-1")) {
            sum += Integer.parseInt(s);
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
