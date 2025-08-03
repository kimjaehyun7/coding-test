package baekjoon;

import java.io.*;

public class Baekjoon_5523 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if (a > b) {
                scoreA++;
            } else if (b > a) {
                scoreB++;
            }
        }

        bw.write(scoreA + " " + scoreB);
        bw.flush();
        bw.close();
        br.close();
    }
}
