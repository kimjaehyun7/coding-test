package baekjoon;

import java.io.*;

public class Baekjoon_20499 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("/");
        int k = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int a = Integer.parseInt(arr[2]);

        if (k + a < d || d == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
