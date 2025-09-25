package baekjoon;

import java.io.*;

public class Baekjoon_26068 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int day = Integer.parseInt(br.readLine().split("-")[1]);

            if (day <= 90) {
                count++;
            }

        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
