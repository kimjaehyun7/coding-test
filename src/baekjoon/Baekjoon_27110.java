package baekjoon;

import java.io.*;

public class Baekjoon_27110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            int m = Integer.parseInt(s[i]);

            if (n >= m) {
                count += m;
            } else {
                count += n;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
