package baekjoon;

import java.io.*;

public class Baekjoon_4892 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        String s;
        while (!(s = br.readLine()).equals("0")) {
            bw.write(count++ + ". ");
            int n0 = Integer.parseInt(s);
            int n1 = n0 * 3;
            int n2;
            if (n1 % 2 == 0) {
                bw.write("even ");
                n2 = n1 / 2;
            } else {
                bw.write("odd ");
                n2 = (n1 + 1) / 2;
            }
            int n3 = n2 * 3;
            int n4 = n3 / 9;

            bw.write(n4 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
