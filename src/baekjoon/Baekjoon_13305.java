package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_13305 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long min = 0;
        int n = Integer.parseInt(br.readLine());
        int[] road = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();// n-1개 입력

        int[] price = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); // n개 입력

        long curPrice = price[0];
        for (int i = 0; i < n - 1; i++) {
            min += curPrice * road[i];
            if (curPrice > price[i + 1]) {
                curPrice = price[i + 1];
            }
        }
        bw.write(min + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
