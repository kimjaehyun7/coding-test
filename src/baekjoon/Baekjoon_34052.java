package baekjoon;

import java.io.*;

public class Baekjoon_34052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 300;

        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        if (sum <= 1800) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
