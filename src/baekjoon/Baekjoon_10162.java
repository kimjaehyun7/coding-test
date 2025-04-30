package baekjoon;

import java.io.*;

public class Baekjoon_10162 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] button = {300, 60, 10};
        int[] count = new int[3];

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < button.length; i++) {
            count[i] = n / button[i];
            n %= button[i];
        }
        if (n == 0) {
            for (int i : count) {
                bw.write(i + " ");
            }
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
