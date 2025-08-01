package baekjoon;

import java.io.*;

public class Baekjoon_21300 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (String s : br.readLine().split(" ")) {
            sum += Integer.parseInt(s);
        }

        bw.write(sum * 5 + "");


        bw.flush();
        bw.close();
        br.close();

    }
}
