package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_5543 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] burger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 3; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }
        int cheapSet = Arrays.stream(burger).min().getAsInt() + Arrays.stream(drink).min().getAsInt() - 50;

        bw.write(cheapSet+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
