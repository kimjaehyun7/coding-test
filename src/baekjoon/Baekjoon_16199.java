package baekjoon;

import java.io.*;

public class Baekjoon_16199 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int bY = Integer.parseInt(arr[0]);
        int bM = Integer.parseInt(arr[1]);
        int bD = Integer.parseInt(arr[2]);

        String[] arr1 = br.readLine().split(" ");
        int sY = Integer.parseInt(arr1[0]);
        int sM = Integer.parseInt(arr1[1]);
        int sD = Integer.parseInt(arr1[2]);

        if (check(bM, bD, sM, sD)) {
            bw.write((sY - bY) + "\n");
        } else {
            bw.write((sY - bY - 1) + "\n");
        }

        bw.write((sY - bY + 1) + "\n");
        bw.write((sY - bY) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean check(int bM, int bD, int sM, int sD) {
        if (bM < sM) {
            return true;
        } else if (bM == sM) {
            if (bD <= sD) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }
}
