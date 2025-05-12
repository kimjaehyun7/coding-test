package baekjoon;

import java.io.*;

public class Baekjoon_3460 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            String str = Integer.toString(num, 2);
            StringBuilder sb = new StringBuilder();
            str = sb.append(str).reverse().toString();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    bw.write(j+" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
