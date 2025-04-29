package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2490 {

    static String[] arr = {"D","C","B","A","E"};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            int sum = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sum();
            bw.write(arr[sum]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
