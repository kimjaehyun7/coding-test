package baekjoon;

import java.io.*;

public class Baekjoon_6359 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            boolean[] rooms = new boolean[n];
            int count = 0;

            for (int j = 0; j < n; j++) {
                for (int k = j; k < n; k += j+1) {
                    if (!rooms[k]) {
                        rooms[k] = true; // open
                    } else {
                        rooms[k] = false; // close
                    }
                }
            }
            for (boolean room : rooms) {
                if (room) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
