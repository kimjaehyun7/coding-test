package baekjoon;

import java.io.*;

public class Baekjoon_27433 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long sum = 1;

        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
