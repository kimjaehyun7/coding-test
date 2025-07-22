package baekjoon;

import java.io.*;

public class Baekjoon_6378 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            while (s.length() != 1) {
                int sum = 0;
                for (char c : s.toCharArray()) {
                    sum += (c - '0');
                }
                s = String.valueOf(sum);
            }
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
