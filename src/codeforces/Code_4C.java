package codeforces;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Code_4C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            Integer put = map.put(s, map.getOrDefault(s, 0) + 1);

            if (put == null) {
                bw.write("OK\n");
            } else {
                bw.write(s + put + "\n");
            }
        }
        bw.flush();
    }
}
