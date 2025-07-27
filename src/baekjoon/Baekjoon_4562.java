package baekjoon;

import java.io.*;

public class Baekjoon_4562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            if (x >= y) {
                bw.write("MMM BRAINS\n");
            } else {
                bw.write("NO BRAINS\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
