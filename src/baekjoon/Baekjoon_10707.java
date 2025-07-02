package baekjoon;

import java.io.*;

public class Baekjoon_10707 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int x = a * p;
        int y;

        if (c >= p) {
            y = b;
        } else {
            y = b + ((p - c) * d);
        }

        bw.write(Math.min(x, y) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
