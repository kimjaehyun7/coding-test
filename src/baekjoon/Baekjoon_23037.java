package baekjoon;

import java.io.*;

public class Baekjoon_23037 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (char c : br.readLine().toCharArray()) {
            sum += (int) Math.pow(c - '0', 5);
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
