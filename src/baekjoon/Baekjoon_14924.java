package baekjoon;

import java.io.*;

public class Baekjoon_14924 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int s = Integer.parseInt(arr[0]);
        int t = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);

        int result = t * (d / (s * 2));
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
