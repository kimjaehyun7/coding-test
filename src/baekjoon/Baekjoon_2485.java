package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2485 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count  = 0;
        int gcd = 0;
        List<Integer> trees = new ArrayList<>();
        List<Integer> intervals = new ArrayList<>(); // 나무사이의 간격

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            trees.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < trees.size() - 1; i++) {
            intervals.add(trees.get(i + 1) - trees.get(i));
        }

        gcd = gcd(intervals.get(0), intervals.get(1));

        for (int i = 2; i < intervals.size(); i++) {
            gcd = gcd(gcd, intervals.get(i));
        }

        for (Integer interval : intervals) {
            count += interval / gcd - 1;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a % b);
    }
}
