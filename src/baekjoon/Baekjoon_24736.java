package baekjoon;

import java.io.*;

public class Baekjoon_24736 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 2; i++) {
            String[] arr = br.readLine().split(" ");
            int t = Integer.parseInt(arr[0]);
            int f = Integer.parseInt(arr[1]);
            int s = Integer.parseInt(arr[2]);
            int p = Integer.parseInt(arr[3]);
            int c = Integer.parseInt(arr[4]);

            int result = (t * 6) + (f * 3) + (s * 2) + p + (c * 2);
            bw.write(result + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
