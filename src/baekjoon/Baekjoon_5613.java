package baekjoon;

import java.io.*;

public class Baekjoon_5613 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = Integer.parseInt(br.readLine());

        String s;
        while (!(s = br.readLine()).equals("=")) {
            int m = Integer.parseInt(br.readLine());

            if (s.equals("+")) {
                result += m;
            } else if (s.equals("-")) {
                result -= m;
            } else if (s.equals("*")) {
                result *= m;
            } else if (s.equals("/")) {
                result /= m;
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
