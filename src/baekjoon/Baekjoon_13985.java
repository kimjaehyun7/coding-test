package baekjoon;

import java.io.*;

public class Baekjoon_13985 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();

        int a = arr[0] - '0';
        int b = arr[4] - '0';
        int c = arr[8] - '0';

        if (a + b == c) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
