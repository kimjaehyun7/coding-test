package baekjoon;

import java.io.*;

public class Baekjoon_27219 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n / 5; i++) {
            bw.write("V");
        }
        for (int i = 0; i < n % 5; i++) {
            bw.write("I");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
