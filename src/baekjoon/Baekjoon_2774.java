package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_2774 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Set<Character> set = new HashSet<>();
            for (char c : br.readLine().toCharArray()) {
                set.add(c);
            }
            bw.write(set.size() + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
