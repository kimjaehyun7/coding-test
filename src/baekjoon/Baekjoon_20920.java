package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_20920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() < m) {
                continue;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
            set.add(word);
        }
        List<String> list = new ArrayList<>(set);

        list.sort((a, b) -> {
            if (map.get(a) > map.get(b)) { // 빈도
                return -1;
            } else if (map.get(a) < map.get(b)) {
                return 1;
            } else if (a.length() > b.length()) { // 단어 길이
                return -1;
            } else if (a.length() < b.length()) {
                return 1;
            } else {
                return a.compareTo(b); // 사전순
            }
        });

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
