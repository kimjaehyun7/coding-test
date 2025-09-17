package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_15921 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double avg = 0.0;
        double value = 0.0;


        if (n != 0) {
            String[] s = br.readLine().split(" ");

            avg = Arrays.stream(s).mapToInt(Integer::parseInt).average().getAsDouble();

            Map<Integer, Integer> map = new HashMap<>();

            int[] arr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            for (Integer i : map.keySet()) {
                value += i * ((double) map.get(i) / n);
            }
        }

        if (n == 0 || value == 0.0) {
            bw.write("divide by zero");
        } else {
            bw.write(String.format("%.2f", avg / value));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
