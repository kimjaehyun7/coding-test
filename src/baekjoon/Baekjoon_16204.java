package baekjoon;

import java.io.*;

public class Baekjoon_16204 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);

        int frontO = m;
        int frontX = n - m;

        int backO = k;
        int backX = n - k;

        int max = Math.min(frontO, backO) + Math.min(frontX, backX);


        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
