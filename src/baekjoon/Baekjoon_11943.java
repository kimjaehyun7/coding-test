package baekjoon;

import java.io.*;

public class Baekjoon_11943 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] basket1 = br.readLine().split(" ");
        String[] basket2 = br.readLine().split(" ");

        int appleA = Integer.parseInt(basket1[0]);
        int orangeA = Integer.parseInt(basket1[1]);

        int appleB = Integer.parseInt(basket2[0]);
        int orangeB = Integer.parseInt(basket2[1]);

        int result = Math.min(appleA + orangeB, orangeA + appleB);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
