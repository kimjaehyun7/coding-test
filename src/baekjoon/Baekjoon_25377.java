package baekjoon;

import java.io.*;

public class Baekjoon_25377 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        boolean bread = false;

        for (int i = 0; i < n; i++) {
            int t = time(br.readLine());
            if (t == -1) {
                continue;
            }
            min = Math.min(min, t);
            bread = true;
        }

        if (bread) {
            bw.write(min + "");
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static int time(String s) {
        String[] arr = s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if (a > b) {
            return -1;
        }
        return b;
    }
}
