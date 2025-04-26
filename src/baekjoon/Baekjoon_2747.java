package baekjoon;

import java.io.*;

public class Baekjoon_2747 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        bw.write(num1+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
