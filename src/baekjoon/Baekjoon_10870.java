package baekjoon;

import java.io.*;

public class Baekjoon_10870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i < n; i++) {
            int temp = num2;
            num2 += num1;
            num1 = temp;
        }
        bw.write(num2+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
