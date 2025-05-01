package baekjoon;

import java.io.*;

public class Baekjoon_2744 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (char c : br.readLine().toCharArray()) {
            if (isUppercase(c)) {
                bw.write(String.valueOf(c).toLowerCase());
            } else {
                bw.write(String.valueOf(c).toUpperCase());
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isUppercase(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        return false;
    }
}
