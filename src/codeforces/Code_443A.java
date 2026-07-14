package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Code_443A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Character> set = new HashSet<>();
        for (char c : br.readLine().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        bw.write(set.size() + "");
        bw.flush();
    }
}
