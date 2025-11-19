package baekjoon;

import java.io.*;

public class Baekjoon_16017 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());

        if ((i == 8 || i == 9) &&
                j == k &&
                ((l == 8 || l == 9))) {
            bw.write("ignore");
        } else {
            bw.write("answer");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
