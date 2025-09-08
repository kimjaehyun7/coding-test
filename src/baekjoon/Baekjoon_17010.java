package baekjoon;

import java.io.*;

public class Baekjoon_17010 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int m = Integer.parseInt(s[0]);
            String str = s[1];

            for (int j = 0; j < m; j++) {
                bw.write(str);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
