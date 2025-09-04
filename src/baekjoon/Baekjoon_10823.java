package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_10823 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            sb.append(s);
        }
        int sum = Arrays.stream(sb.toString().split(","))
                .mapToInt(Integer::parseInt)
                .sum();

        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
