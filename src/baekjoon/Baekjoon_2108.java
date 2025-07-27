package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(null);
        for (int i = 0; i < n; i++) {
            Integer num = list.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        IntSummaryStatistics st = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        double average = st.getAverage();
        int range = st.getMax() - st.getMin();
        Integer center = list.get(list.size() / 2);

        int max = map.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Integer num = list.get(i);
            if (map.get(num) == max) {
                set.add(num);
            }
        }

        List<Integer> modes = new ArrayList<>(set);
        modes.sort(null);
        int mode;
        if (modes.size() > 1) {
            mode = modes.get(1);
        } else {
            mode = modes.get(0);
        }

        bw.write(Math.round(average) + "\n");
        bw.write(center + "\n");
        bw.write(mode + "\n");
        bw.write(range + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
