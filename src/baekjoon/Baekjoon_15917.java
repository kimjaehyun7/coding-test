package baekjoon;

import java.io.*;

public class Baekjoon_15917 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            int a = Integer.parseInt(br.readLine());

            int result = (a & (-a));

            if (result == a) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
