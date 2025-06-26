package baekjoon;

import java.io.*;

public class Baekjoon_13866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int ad = Integer.parseInt(arr[0]) + Integer.parseInt(arr[3]);
        int bc = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]);

        int max = Math.max(ad, bc);
        int min = Math.min(ad, bc);

        bw.write((max - min) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
