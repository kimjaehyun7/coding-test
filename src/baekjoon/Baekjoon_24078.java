package baekjoon;

import java.io.*;

public class Baekjoon_24078 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        bw.write(x % 21 + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
