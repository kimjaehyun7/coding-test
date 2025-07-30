package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baekjoon_2997 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();


        for (String s : br.readLine().split(" ")) {
            set.add(Integer.parseInt(s));
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(null);

        int target = Math.min(list.get(1) - list.get(0), list.get(2) - list.get(1));
        int sum = list.get(0);

        for (int i = 0; i < 4; i++) {
            if (set.add(sum)) {
                bw.write(sum + "");
                break;
            }
            sum += target;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
