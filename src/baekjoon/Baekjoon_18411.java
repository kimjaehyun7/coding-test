package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_18411 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        int result = arr[1] + arr[2];

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
