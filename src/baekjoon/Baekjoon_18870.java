package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_18870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String s : arr) {
            set.add(Integer.parseInt(s));
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort(null);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        for (String s : arr) {
            bw.write(map.get(Integer.parseInt(s)) + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
