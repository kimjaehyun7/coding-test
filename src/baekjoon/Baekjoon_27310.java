package baekjoon;

import java.io.*;

public class Baekjoon_27310 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String imoji = br.readLine();

        int col = 0;
        int under = 0;

        for (String s : imoji.split("")) {
            if (s.equals(":")) {
                col++;
            }
            if (s.equals("_")) {
                under++;
            }
        }

        int result = imoji.length() + col + under * 5;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
