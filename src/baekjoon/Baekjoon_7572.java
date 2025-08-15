package baekjoon;

import java.io.*;

public class Baekjoon_7572 {

    static int[] gan = {6, 7, 8, 9, 0, 1, 2, 3, 4, 5}; // 0 ~ 9
    static char[] ji = {'I', 'J', 'K', 'L', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'}; // 0 ~ 11

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int g = n % 10;
        int j = n % 12;

        int i = gan[g];
        char c = ji[j];

        bw.write(c + "" + i);
        bw.flush();
        bw.close();
        br.close();

    }
}
