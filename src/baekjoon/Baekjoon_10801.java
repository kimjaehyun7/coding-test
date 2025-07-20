package baekjoon;

import java.io.*;

public class Baekjoon_10801 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int aScore = 0;
        int bScore = 0;

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");


        for (int i = 0; i < 10; i++) {
            int aCard = Integer.parseInt(a[i]);
            int bCard = Integer.parseInt(b[i]);

            if (aCard > bCard) {
                aScore++;
            } else if (bCard > aCard) {
                bScore++;
            }
        }

        if (aScore > bScore) {
            bw.write("A");
        } else if (bScore > aScore) {
            bw.write("B");
        } else {
            bw.write("D");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
