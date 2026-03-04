package baekjoon;

import java.io.*;

public class Baekjoon_9772 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0 0")) {
            String[] sp = s.split(" ");
            double x = Double.parseDouble(sp[0]);
            double y = Double.parseDouble(sp[1]);

            if (x == 0 || y == 0) {
                bw.write("AXIS\n");
            } else if (x > 0 && y > 0) {
                bw.write("Q1\n");
            } else if (x < 0 && y > 0) {
                bw.write("Q2\n");
            } else if (x < 0 && y < 0) {
                bw.write("Q3\n");
            } else {
                bw.write("Q4\n");
            }
        }

        bw.write("AXIS");
        bw.flush();
        bw.close();
        br.close();
    }
}
