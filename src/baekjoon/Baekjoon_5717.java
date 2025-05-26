package baekjoon;

import java.io.*;

public class Baekjoon_5717 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] arr = br.readLine().split(" ");
            int m = Integer.parseInt(arr[0]);
            int f = Integer.parseInt(arr[1]);

            if (m + f == 0) {
                break;
            }
            bw.write((m + f) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
