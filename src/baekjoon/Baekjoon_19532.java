package baekjoon;

import java.io.*;

public class Baekjoon_19532 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        int e = Integer.parseInt(arr[4]);
        int f = Integer.parseInt(arr[5]);

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i) + (b * j) == c) {
                    if ((d * i) + (e * j) == f) {
                        bw.write(i + " " + j);
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
