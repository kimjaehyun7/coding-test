package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_27160 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            String S = s[0];
            int X = Integer.parseInt(s[1]);

            map.put(S, map.getOrDefault(S, 0) + X);
        }
        boolean bell = false;
        for (Integer value : map.values()) {
            if (value == 5) {
                bell = true;
                break;
            }
        }

        if (bell) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
