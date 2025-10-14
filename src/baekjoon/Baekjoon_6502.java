package baekjoon;

import java.io.*;

public class Baekjoon_6502 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        String s;
        while (!(s = br.readLine()).equals("0")) {
            String[] sp = s.split(" ");
            int r = Integer.parseInt(sp[0]) * 2; // 식탁 지름
            int w = Integer.parseInt(sp[1]); // 피자 너비
            int l = Integer.parseInt(sp[2]); // 피자 높이

            if (r * r >= w * w + l * l) {
                bw.write("Pizza " + count++ + " fits on the table.\n");
            } else {
                bw.write("Pizza " + count++ + " does not fit on the table.\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
