package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1453 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] computer = new boolean[100];
        int count = 0;

        int n = Integer.parseInt(br.readLine());

        String[] customers = br.readLine().split(" ");
        for (String c : customers) {
            int customer = Integer.parseInt(c);
            if (!computer[customer - 1]) {
                computer[customer - 1] = true;
            } else {
                count++;
            }
        }
        bw.write(count+"");


        bw.flush();
        bw.close();
        br.close();

    }

}
