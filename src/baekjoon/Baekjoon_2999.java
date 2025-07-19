package baekjoon;

import java.io.*;

public class Baekjoon_2999 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String message = br.readLine();
        int n = message.length();
        int r = 0;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    if (i * j == n) {
                        r = i;
                        c = j;
                    }
                }
            }
        }
        char[][] arr = new char[r][c];
        char[] array = message.toCharArray();
        int sequence = 0;

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                char ch = array[sequence];
                arr[j][i] = ch;
                sequence++;
            }
        }
        for (char[] chars : arr) {
            for (char aChar : chars) {
                bw.write(aChar + "");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
