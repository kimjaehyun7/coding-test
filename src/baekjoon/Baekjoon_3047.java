package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon_3047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for (String s : br.readLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        list.sort(null);

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', list.get(0));
        map.put('B', list.get(1));
        map.put('C', list.get(2));

        for (char c : br.readLine().toCharArray()) {
            bw.write(map.get(c) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
