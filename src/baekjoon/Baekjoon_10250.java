package baekjoon;

import java.io.*;

public class Baekjoon_10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            String[] split = br.readLine().split(" ");
            int h = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
            int n = Integer.parseInt(split[2]);
            int count = 0;

            for (int j = 1; j <= w; j++) {
                for (int k = 1; k <= h; k++) {
                    count++;
                    if (count == n) {
                        bw.write((k*100+j)+"\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
