package baekjoon;

import java.io.*;

public class Baekjoon_17362 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n % 8 == 0) {
            bw.write("2");
        } else {
            int result = n % 8;

            if (result == 6) {
                result = 4;
            } else if (result == 7) {
                result = 3;
            }


             bw.write(result+"");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
