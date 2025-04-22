package baekjoon;

import java.io.*;

public class Baekjoon_10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        bw.write(fact+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
