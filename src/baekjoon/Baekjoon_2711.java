package baekjoon;

import java.io.*;

public class Baekjoon_2711 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            String string = arr[1];

            String front = string.substring(0, n - 1);
            String back = string.substring(n);

            bw.write(front + back + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
