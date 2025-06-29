package baekjoon;

import java.io.*;

public class Baekjoon_9325 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int totalPrice = 0;

            totalPrice += Integer.parseInt(br.readLine());

            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                String[] arr = br.readLine().split(" ");
                int q = Integer.parseInt(arr[0]);
                int p = Integer.parseInt(arr[1]);

                totalPrice += (q * p);
            }

            bw.write(totalPrice + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
