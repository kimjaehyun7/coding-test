package baekjoon;

import java.io.*;

public class Baekjoon_10768 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        switch (m) {
            case 1:
                bw.write("Before");
                break;
            case 2:
                if (d < 18) {
                    bw.write("Before");
                } else if (d > 18) {
                    bw.write("After");
                } else {
                    bw.write("Special");
                }
                break;
            default:
                bw.write("After");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
