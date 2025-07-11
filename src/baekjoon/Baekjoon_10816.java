package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (String s : br.readLine().split(" ")) {
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        for (String s : br.readLine().split(" ")) {
            Integer result = map.getOrDefault(Integer.parseInt(s), 0);
            bw.write(result + " ");

        }
        bw.flush();
        bw.close();
        br.close();

    }

}
