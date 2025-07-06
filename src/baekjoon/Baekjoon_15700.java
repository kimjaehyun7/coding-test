package baekjoon;

import java.io.*;

public class Baekjoon_15700 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        long n = Long.parseLong(arr[0]);
        long m = Long.parseLong(arr[1]);

        long wall = n * m;

        bw.write(wall / 2 + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
