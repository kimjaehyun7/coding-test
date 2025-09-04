package baekjoon;

import java.io.*;

public class Baekjoon_10174 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine().toLowerCase();
            StringBuilder sb = new StringBuilder();
            String rev = sb.append(str).reverse().toString();

            if (str.equals(rev)) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
