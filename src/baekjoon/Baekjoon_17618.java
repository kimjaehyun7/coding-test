package baekjoon;

import java.io.*;

public class Baekjoon_17618 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (char c : String.valueOf(i).toCharArray()) {
                sum += c - '0';
            }
            if (i % sum == 0) {
                count++;
            }

        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
