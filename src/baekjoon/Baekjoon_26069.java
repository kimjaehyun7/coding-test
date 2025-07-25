package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_26069 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (set.contains(s[0])) {
                set.add(s[1]);
            }
            if (set.contains(s[1])) {
                set.add(s[0]);
            }
        }

        bw.write(set.size() + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
