package baekjoon;

import java.io.*;

public class Baekjoon_27294 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int t = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);

        if ((t >= 12 && t <= 16) && s == 0) {
            bw.write("320");
        } else {
            bw.write("280");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
