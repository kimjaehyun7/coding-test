package baekjoon;

import java.io.*;

public class Baekjoon_16561 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int count = 1;

        if (!(n == 3 || n == 6)) {
            for (int i = 9; i <= n; i += 3) {
                result += count++;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
