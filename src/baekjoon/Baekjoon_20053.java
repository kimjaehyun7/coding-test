package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Baekjoon_20053 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            IntSummaryStatistics st = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .summaryStatistics();

            int min = st.getMin();
            int max = st.getMax();

            bw.write(min + " " + max + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
