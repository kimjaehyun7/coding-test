package baekjoon;

import java.io.*;

public class Baekjoon_10834 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        boolean isForward = true;
        int rotate = 1;

        for (int i = 0; i < m; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int s = Integer.parseInt(arr[2]);

            rotate = (rotate / a) * b;

            if (s == 1) {
                if (isForward) {
                    isForward = false;
                } else {
                    isForward = true;
                }
            }
        }
        if (isForward) {
            bw.write("0 " + rotate);
        } else {
            bw.write("1 " + rotate);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
