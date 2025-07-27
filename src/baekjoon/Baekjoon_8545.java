package baekjoon;

import java.io.*;

public class Baekjoon_8545 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String result = sb.append(br.readLine()).reverse().toString();

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    }
}
