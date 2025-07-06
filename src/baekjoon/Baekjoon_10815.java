package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Baekjoon_10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (String s : br.readLine().split(" ")) {
            set.add(Integer.parseInt(s));
        }

        int m = Integer.parseInt(br.readLine());

        for (String s : br.readLine().split(" ")) {
            if (set.contains(Integer.parseInt(s))) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
