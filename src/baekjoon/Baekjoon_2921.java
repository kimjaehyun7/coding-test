package baekjoon;

import java.io.*;

public class Baekjoon_2921 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int dots = 0;
        int sameDots = 0;


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) {
                    sameDots += (i + j);
                } else {
                    dots += (i + j);
                }
            }
        }
        int result = sameDots + (dots / 2);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
