package baekjoon;

import java.io.*;

public class Baekjoon_3062 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            String reverseStr = sb.append(str).reverse().toString();
            sb.delete(0, sb.length());
            int sum = Integer.parseInt(str) + Integer.parseInt(reverseStr);
            if (sb.append(sum).reverse().toString().equals(String.valueOf(sum))) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();

    }
}
