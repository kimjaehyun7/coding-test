package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_14487 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] s = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int result = Arrays.stream(s).sum() - s[s.length - 1];

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
