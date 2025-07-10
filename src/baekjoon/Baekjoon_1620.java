package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]); // 도감에 수록되어 있는 포켓몬의 개수
        int m = Integer.parseInt(arr[1]); // 맞춰야 하는 문제 개수

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String p = br.readLine();
            map.put(p, i);
            map2.put(i, p);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            try {
                int num = Integer.parseInt(str);
                bw.write(map2.get(num) + "\n");
            } catch (NumberFormatException e) {
                bw.write(map.get(str) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
