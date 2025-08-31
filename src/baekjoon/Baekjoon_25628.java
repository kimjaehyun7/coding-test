package baekjoon;

import java.io.*;

public class Baekjoon_25628 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int result = Math.min((a / 2), b);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
