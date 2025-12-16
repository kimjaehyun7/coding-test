package baekjoon;

import java.io.*;

public class Baekjoon_29736 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        String[] sp = br.readLine().split(" ");
        int K = Integer.parseInt(sp[0]);
        int X = Integer.parseInt(sp[1]);
        int count = 0;
        for (int i = A; i <= B; i++) {
            if ((K - X) <= i && (K + X) >= i) {
                count++;
            }
        }
        if (count == 0) {
            bw.write("IMPOSSIBLE");
        } else {
            bw.write(count + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
