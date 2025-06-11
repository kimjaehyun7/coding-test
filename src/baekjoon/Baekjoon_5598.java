package baekjoon;

import java.io.*;

public class Baekjoon_5598 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (char c : br.readLine().toCharArray()) {
            bw.write(conv(c) + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static char conv(char c) {
        int result = c - 3;
        if (result < 65) {
            result += 26;
        }
        return (char) result;
    }
}
