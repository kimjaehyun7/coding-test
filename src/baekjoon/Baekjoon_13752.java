package baekjoon;

import java.io.*;

public class Baekjoon_13752 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            for (int j = 0; j < k; j++) {
                bw.write("=");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
