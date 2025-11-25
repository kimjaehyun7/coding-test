package baekjoon;

import java.io.*;

public class Baekjoon_27331 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        bw.write(a + b);
        bw.flush();
        bw.close();
        br.close();
    }
}
