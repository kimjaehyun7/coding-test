package baekjoon;

import java.io.*;

public class Baekjoon_6810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = "9780921418";
        for (int i = 0; i < 3; i++) {
            num += br.readLine();
        }
        int isbn = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                isbn += (num.charAt(i) - '0');
            } else {
                isbn += (num.charAt(i) - '0') * 3;
            }
        }

        bw.write("The 1-3-sum is " + isbn);
        bw.flush();
        bw.close();
        br.close();

    }
}
