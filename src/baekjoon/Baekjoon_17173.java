package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_17173 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for (int i : Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()) {
            for (int j = i; j <= N; j += i) {
                if (set.add(j)) {
                    sum += j;
                }
            }
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
