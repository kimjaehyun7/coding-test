package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_13416 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int sum = 0;

            for (int j = 0; j < N; j++) {
                int[] arr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                Arrays.sort(arr);

                int best = arr[2];

                if (best > 0) {
                    sum += best;
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
