package baekjoon;

import java.io.*;

public class Baekjoon_15873 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        char[] arr = br.readLine().toCharArray();

        for (char c : arr) {
            if (c == '0') {
                sum += 9;
            }
            sum += c - '0';
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
