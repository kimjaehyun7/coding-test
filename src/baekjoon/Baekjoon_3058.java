package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Baekjoon_3058 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            IntSummaryStatistics statistics = Arrays.stream(arr)
                    .mapToInt(Integer::parseInt)
                    .filter(a -> a % 2 == 0)
                    .summaryStatistics();
            long sum = statistics.getSum();
            int min = statistics.getMin();
            bw.write(sum + " " + min + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
