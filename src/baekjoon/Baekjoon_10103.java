package baekjoon;

import java.io.*;

public class Baekjoon_10103 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int c = 100;
        int s = 100;

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[1]);

            if (num1 > num2) {
                s -= num1;
            } else if (num2 > num1) {
                c -= num2;
            }
        }

        bw.write(c + "\n" + s);
        bw.flush();
        bw.close();
        br.close();
    }
}
