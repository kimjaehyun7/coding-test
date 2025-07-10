package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_7785 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            String name = arr[0];
            String status = arr[1];

            if (status.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());

        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
