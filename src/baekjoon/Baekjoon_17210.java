package baekjoon;

import java.io.*;

public class Baekjoon_17210 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        int door = Integer.parseInt(br.readLine());

        if (n >= 6) {
            bw.write("Love is open door");
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (door == 0) {
                    bw.write("1\n");
                    door = 1;
                } else {
                    bw.write("0\n");
                    door = 0;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
