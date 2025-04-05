package baekjoon;

import java.io.*;

public class Baekjoon_1550 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int decimal = Integer.parseInt(str, 16);

        bw.write(decimal+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
