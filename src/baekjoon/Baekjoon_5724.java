package baekjoon;

import java.io.*;

public class Baekjoon_5724 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);

            int result = 0;
            for (int i = 1; i <= n; i++) {
                result += i * i;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
