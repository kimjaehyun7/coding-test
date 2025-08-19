package baekjoon;

import java.io.*;

public class Baekjoon_24082 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int result = x * x * x;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
