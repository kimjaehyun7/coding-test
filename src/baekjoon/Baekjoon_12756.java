package baekjoon;

import java.io.*;

public class Baekjoon_12756 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int attackA = Integer.parseInt(s[0]);
        int hpA = Integer.parseInt(s[1]);

        String[] sp = br.readLine().split(" ");
        int attackB = Integer.parseInt(sp[0]);
        int hpB = Integer.parseInt(sp[1]);

        int countA = (hpB % attackA == 0) ? hpB / attackA : hpB / attackA + 1;
        int countB = (hpA % attackB == 0) ? hpA / attackB : hpA / attackB + 1;

        if (countA < countB) {
            bw.write("PLAYER A");
        } else if (countB < countA) {
            bw.write("PLAYER B");
        } else {
            bw.write("DRAW");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
