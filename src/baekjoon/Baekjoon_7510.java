package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_7510 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] arr = br.readLine().split(" ");
            int[] array = Arrays.stream(arr)
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
            int a = array[0];
            int b = array[1];
            int c = array[2];

            String result = Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) ? "yes" : "no";

            bw.write("Scenario #" + i + ":\n");
            bw.write(result + "\n\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
