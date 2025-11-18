package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_8723 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        if (a == b && b == c) {
            bw.write("2");
        } else if ((a * a) + (b * b) == c * c) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
