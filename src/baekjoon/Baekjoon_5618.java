package baekjoon;

import java.io.*;

public class Baekjoon_5618 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        if (n == 2) {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int max = Math.max(a, b);

            for (int i = 1; i <= max; i++) {
                if (a % i == 0 && b % i == 0) {
                    bw.write(i + "\n");
                }
            }
        } else {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int max = Math.max(Math.max(a, b), c);

            for (int i = 1; i <= max; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
