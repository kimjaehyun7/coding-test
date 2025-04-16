package baekjoon;

import java.io.*;

public class Baekjoon_2010 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            int plug = Integer.parseInt(br.readLine());

            if (i == n - 1) {
                count += plug;
            } else {
                count += plug - 1;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
