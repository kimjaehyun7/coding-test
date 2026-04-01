package baekjoon;

import java.io.*;

public class Baekjoon_32025 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int min = Math.min(a, b);

        int result = (min * 100) / 2;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
