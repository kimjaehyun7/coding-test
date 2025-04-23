package baekjoon;

import java.io.*;

public class Baekjoon_2748 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long num1 = 0;
        long num2 = 1;

        for (int i = 1; i < n; i++) {
            long temp = num2;
            num2 += num1;
            num1 = temp;
        }
        if (n == 0) {
            bw.write(num1 + "");
        } else {
            bw.write(num2+"");
        }


        bw.flush();
        bw.close();
        br.close();

    }

}
