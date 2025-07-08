package baekjoon;

import java.io.*;

public class Baekjoon_10569 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            int v = Integer.parseInt(arr[0]);
            int e = Integer.parseInt(arr[1]);

            int result = 2 - v + e;
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
