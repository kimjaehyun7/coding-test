package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baekjoon_1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        for (int i = 0; i < n; i++) {
            set1.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (!set1.add(s)) {
                set2.add(s);
            }
        }
        List<String> list = new ArrayList<>(set2);
        list.sort(null);

        bw.write(list.size() + "\n");
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
