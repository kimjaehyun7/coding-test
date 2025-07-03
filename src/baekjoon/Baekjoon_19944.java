package baekjoon;

import java.io.*;

public class Baekjoon_19944 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        if (m >= 1 && m <= 2) {
            bw.write("NEWBIE!");
        } else if (m <= n) {
            bw.write("OLDBIE!");
        } else {
            bw.write("TLE!");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
