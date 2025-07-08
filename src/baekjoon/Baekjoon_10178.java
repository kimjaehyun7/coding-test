package baekjoon;

import java.io.*;

public class Baekjoon_10178 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            int c = Integer.parseInt(arr[0]); // 사탕의 수
            int v = Integer.parseInt(arr[1]); // 형제의 수

            int q = c / v;
            int r = c % v;

            bw.write("You get " + q + " piece(s) and your dad gets " + r + " piece(s).\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
