package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class Baekjoon_17388 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        Map<String, String> map = Map.of(arr[0], "Soongsil", arr[1], "Korea", arr[2], "Hanyang");

        IntSummaryStatistics st = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .summaryStatistics();

        if (st.getSum() >= 100) {
            bw.write("OK");
        } else {
            bw.write(map.get(String.valueOf(st.getMin())));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
