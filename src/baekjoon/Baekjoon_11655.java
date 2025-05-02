package baekjoon;

import java.io.*;

public class Baekjoon_11655 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (char c : br.readLine().toCharArray()) {
            bw.write(rot13(c) + "");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static char rot13(char c) {
        if (c == ' ' || (c >= 48 && c <= 57)) {
            return c;
        }
        for (int i = 0; i < 13; i++) {
            c++;
            if (c == 91 || c == 123) {
                c -= 26;
            }
        }
        return c;
    }
}
