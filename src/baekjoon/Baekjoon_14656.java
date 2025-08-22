package baekjoon;

import java.io.*;

public class Baekjoon_14656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String[] s = br.readLine().split(" ");

        for (int i = 1; i <= n; i++) {
            int student = Integer.parseInt(s[i - 1]);
            if (student != i) {
                count++;
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
