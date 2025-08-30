package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_11024 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int sum = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sum();
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
