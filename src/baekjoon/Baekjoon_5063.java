package baekjoon;

import java.io.*;

public class Baekjoon_5063 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int r = Integer.parseInt(arr[0]);
            int e = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            if (r > e - c) {
                bw.write("do not advertise\n");
            } else if (r < e - c) {
                bw.write("advertise\n");
            } else {
                bw.write("does not matter\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
