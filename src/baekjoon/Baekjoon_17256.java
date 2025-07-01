package baekjoon;

import java.io.*;

public class Baekjoon_17256 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");

        int aX = Integer.parseInt(a[0]);
        int aY = Integer.parseInt(a[1]);
        int aZ = Integer.parseInt(a[2]);

        int cX = Integer.parseInt(c[0]);
        int cY = Integer.parseInt(c[1]);
        int cZ = Integer.parseInt(c[2]);

        bw.write((cX - aZ) + " " + (cY / aY) + " " + (cZ - aX));
        bw.flush();
        bw.close();
        br.close();
    }
}
