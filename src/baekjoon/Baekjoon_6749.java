package baekjoon;

import java.io.*;

public class Baekjoon_6749 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int result = m + (m - y);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
