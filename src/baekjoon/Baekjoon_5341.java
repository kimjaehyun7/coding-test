package baekjoon;

import java.io.*;

public class Baekjoon_5341 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
