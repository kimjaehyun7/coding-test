package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_15059 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] req = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (req[i] > arr[i]) {
                count += (req[i] - arr[i]);
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
