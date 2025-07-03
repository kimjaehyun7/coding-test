package baekjoon;

import java.io.*;

public class Baekjoon_11944 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(n);
        }

        if (sb.length() < m) {
            m = sb.length();
        }

        String substring = sb.substring(0, m);


        bw.write(substring);
        bw.flush();
        bw.close();
        br.close();

    }
}
