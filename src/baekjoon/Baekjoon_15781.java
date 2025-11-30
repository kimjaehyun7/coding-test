package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_15781 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[0]);

        int helmet = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .max().getAsInt();
        int vest = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .max().getAsInt();

        bw.write(helmet + vest + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
