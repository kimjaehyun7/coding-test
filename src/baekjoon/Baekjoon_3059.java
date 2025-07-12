package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_3059 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int value = 2015; // A ~ Z 의 아스키코드 합
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int result = value;
            Set<Character> set = new HashSet<>();
            for (char c : br.readLine().toCharArray()) {
                set.add(c);
            }
            for (Character c : set) {
                result -= c;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
