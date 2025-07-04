package baekjoon;

import java.io.*;

public class Baekjoon_7891 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            bw.write((x + y) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
