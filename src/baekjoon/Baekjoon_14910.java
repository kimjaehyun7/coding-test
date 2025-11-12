package baekjoon;

import java.io.*;

public class Baekjoon_14910 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isAsc = true;
        int current = Integer.MIN_VALUE;
        for (String s : br.readLine().split(" ")) {
            int n = Integer.parseInt(s);
            if (current <= n) {
                current = n;
            } else {
                isAsc = false;
                break;
            }
        }
        if (isAsc) {
            bw.write("Good");
        } else {
            bw.write("Bad ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
