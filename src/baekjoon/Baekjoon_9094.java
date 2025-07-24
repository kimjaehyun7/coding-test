package baekjoon;

import java.io.*;

public class Baekjoon_9094 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int count = 0;

            for (int j = 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double result = (Math.pow(j, 2) + Math.pow(k, 2) + m) / (j * k);
                    if (result % 1 == 0) {
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
