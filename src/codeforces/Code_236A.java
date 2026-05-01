package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Code_236A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Character> set = new HashSet<>();

        for (char c : br.readLine().toCharArray()) {
            set.add(c);
        }

        if (set.size() % 2 == 0) { // 여성
            bw.write("CHAT WITH HER!");
        } else { // 남성
            bw.write("IGNORE HIM!");
        }
        bw.flush();
    }
}
