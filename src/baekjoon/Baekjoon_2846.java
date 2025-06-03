package baekjoon;

import java.io.*;

public class Baekjoon_2846 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int max = 0;
        int load = 0;
        int current = Integer.parseInt(split[0]);
        boolean up;

        for (int i = 1; i < n; i++) {
            int height = Integer.parseInt(split[i]);
            up = current < height;
            if (i == n - 1) {
                load += height - current;
                max = Math.max(max, load);
                break;
            }
            if (up) {
                load += height - current;
            } else {
                max = Math.max(max, load);
                load = 0;
            }
            current = height;
        }

        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
