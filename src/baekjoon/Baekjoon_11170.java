package baekjoon;

import java.io.*;

public class Baekjoon_11170 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);

            for (int j = n; j <= m; j++) {
                String replaced = String.valueOf(j).replaceAll("[123456789]", "");
                sb.append(replaced);
            }
            bw.write(sb.length() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
