package baekjoon;

import java.io.*;

public class Baekjoon_10865 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] arr = new int[N + 1];

        for (int i = 0; i < M; i++) {
            String[] sp = br.readLine().split(" ");
            int A = Integer.parseInt(sp[0]);
            int B = Integer.parseInt(sp[1]);

            arr[A]++;
            arr[B]++;
        }
        for (int i = 1; i <= N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
