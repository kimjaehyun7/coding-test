package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Code_228A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();

        for (String s : br.readLine().split(" ")) {
            set.add(s);
        }

        int result = 4 - set.size();

        bw.write(result + "");
        bw.flush();
    }
}
