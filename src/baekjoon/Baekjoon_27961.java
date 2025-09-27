package baekjoon;

import java.io.*;

public class Baekjoon_27961 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        if (n == 0) {
            bw.write("0");
        } else {
            long cat = 1;
            int count  = 1;

            while (n > cat) {
                cat *= 2;
                count++;
            }

            bw.write(count + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
