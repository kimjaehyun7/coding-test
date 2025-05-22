package baekjoon;

import java.io.*;

public class Baekjoon_2902 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String s : br.readLine().split("-")) {
            bw.write(s.charAt(0) +"");
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
