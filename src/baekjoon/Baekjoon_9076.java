package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_9076 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int total = 0;
            String[] arr = br.readLine().split(" ");
            int[] array = Arrays.stream(arr)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Arrays.sort(array);

            if (array[3] - array[1] >= 4) {
                bw.write("KIN\n");
            } else {
                bw.write((array[1] + array[2] + array[3]) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
