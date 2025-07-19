package baekjoon;

import java.io.*;

public class Baekjoon_13909 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = (int) Math.sqrt(n);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
