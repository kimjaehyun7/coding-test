package baekjoon;

import java.io.*;

public class Baekjoon_3034 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int w = Integer.parseInt(arr[1]);
        int h = Integer.parseInt(arr[2]);

        for (int i = 0; i < n; i++) {
            int l = Integer.parseInt(br.readLine());

            if (Math.pow(l, 2) <= Math.pow(w, 2) + Math.pow(h, 2)) {
                bw.write("DA\n");
            } else {
                bw.write("NE\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
