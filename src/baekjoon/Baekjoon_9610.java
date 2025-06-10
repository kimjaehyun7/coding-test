package baekjoon;

import java.io.*;

public class Baekjoon_9610 {

    static int[] arr = new int[5]; // 축, 4분면

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            findDot(br.readLine());
        }
        bw.write("Q1: " + arr[1]+"\n");
        bw.write("Q2: " + arr[2]+"\n");
        bw.write("Q3: " + arr[3]+"\n");
        bw.write("Q4: " + arr[4]+"\n");
        bw.write("AXIS: " + arr[0]);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void findDot(String dots) {
        String[] split = dots.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);

        if (x == 0 || y == 0) {
            arr[0]++;
            return;
        }
        if (x > 0) {
            if (y > 0) {
                arr[1]++;
            } else {
                arr[4]++;
            }
        } else {
            if (y > 0) {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
    }
}
