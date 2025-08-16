package baekjoon;

import java.io.*;

public class Baekjoon_16431 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] B = br.readLine().split(" ");
        int bx = Integer.parseInt(B[0]);
        int by = Integer.parseInt(B[1]);

        String[] D = br.readLine().split(" ");
        int dx = Integer.parseInt(D[0]);
        int dy = Integer.parseInt(D[1]);

        String[] J = br.readLine().split(" ");
        int jx = Integer.parseInt(J[0]);
        int jy = Integer.parseInt(J[1]);

        bx = Math.abs(jx - bx);
        by = Math.abs(jy - by);
        int bCount = Math.max(bx, by);

        dx = Math.abs(jx - dx);
        dy = Math.abs(jy - dy);
        int dCount = dx + dy;

        if (bCount > dCount) {
            bw.write("daisy");
        } else if (dCount > bCount) {
            bw.write("bessie");
        } else {
            bw.write("tie");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
