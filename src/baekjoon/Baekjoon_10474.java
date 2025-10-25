package baekjoon;

import java.io.*;

public class Baekjoon_10474 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0 0")) {
            String[] sp = s.split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);

            int i = a / b;
            a %= b;

            bw.write(i + " " + a + " / " + b + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
