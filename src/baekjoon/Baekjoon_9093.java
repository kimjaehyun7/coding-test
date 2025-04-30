package baekjoon;

import java.io.*;

public class Baekjoon_9093 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            for (String s : split) {
                StringBuilder sb = new StringBuilder();
                String str = sb.append(s).reverse().toString();
                bw.write(str+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
